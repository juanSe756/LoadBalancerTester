package com.springproyect.loadbalancertester.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HostInfoController {

    @GetMapping("/hostinfo")
    public HostInfo getHostInfo() {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            String ipAddress = localhost.getHostAddress();
            String hostName = localhost.getHostName();
            return new HostInfo(ipAddress, hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Getter
    @Setter
    private static class HostInfo {
        private String ip;
        private String hostName;

        public HostInfo(String ip, String hostName) {
            this.ip = ip;
            this.hostName = hostName;
        }
    }
}