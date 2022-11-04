package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return
     */
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        //v3와 비교했을때 modelview가 필요 없음
        return "new-form";
    }
}
