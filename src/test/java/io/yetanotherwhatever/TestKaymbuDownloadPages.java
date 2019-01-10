package io.yetanotherwhatever;

/**
 * Created by achang on 1/10/2019.
 */
public class TestKaymbuDownloadPages {

    /*
        File versions of these test pages can be found in the "<project root >/exampleKaymbuPages" folder
     */

    public static final String SINGLE_IMG_PAGE = "<!DOCTYPE html><html><head><title>Kaymbu Moments</title><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><meta name=\"robots\" content=\"noindex, nofollow\"><meta name=\"robots\" content=\"noindex, nofollow\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><link rel=\"shortcut icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"apple-touch-icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon.png\"><link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-72.png\"><link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-114.png\"><link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-144.png\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/style.css?v=v1222\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/site.css?v=v1222\"><!-- HEADLESS--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/headless.css?v=v1222\"><link rel=\"stylesheet\" href=\"https://vjs.zencdn.net/4.1/video-js.css\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/moments/video.css?v=v1222\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/action/action.css?v=v1222\"><!-- Reskin!--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/reskin.css?v=v1222\"><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/utils/jquery-1.9.1.min.js?v=v1222\"></script><script>var KAYMBU = new function() {\n"+
            "\n"+
            "  var self = this;\n"+
            "  \n"+
            "  this.user = null;\n"+
            "  \n"+
            "  this.access = {\n"+
            "    account: null,\n"+
            "    accountPlan: null,\n"+
            "    hasAccountLimits: false,\n"+
            "    isAccountLimitReached: function(num, key) {\n"+
            "      if (!self.access.hasAccountLimits) {\n"+
            "        return false;\n"+
            "      }\n"+
            "      \n"+
            "      if (self.access.accountPlan.limits[key] === undefined) {\n"+
            "        return true;\n"+
            "      }\n"+
            "      \n"+
            "      var maxAllowed = this.accountPlan.limits[key];\n"+
            "      \n"+
            "      return num >= maxAllowed;\n"+
            "    },\n"+
            "  }\n"+
            "  \n"+
            "}();\n"+
            "</script><script>window.headless = true\n"+
            "\n"+
            "window.config = {\n"+
            "  enviroment: \"production\",\n"+
            "  headless: true\n"+
            "};\n"+
            "\n"+
            "window.nativeCall = function(callURL) {\n"+
            "  if (typeof window.headless == 'undefined' || !window.headless) return;\n"+
            "  var iframe = document.createElement(\"iframe\");\n"+
            "  iframe.setAttribute(\"src\", callURL);\n"+
            "  document.documentElement.appendChild(iframe);\n"+
            "  iframe.parentNode.removeChild(iframe);\n"+
            "  iframe = null;\n"+
            "};\n"+
            "</script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/libs/fastclick.js?v=v1222\"></script><script type=\"text/javascript\" src=\"//vjs.zencdn.net/4.1/video.js\"></script><script type=\"text/javascript\" src=\"//checkout.stripe.com/checkout.js\"></script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/action/actionPage.js?v=v1222\"></script><!-- Include google analytics because this page is rendered in headless mode--><!-- Which normally does -not- include ganalytics.--><script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n"+
            "(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n"+
            "m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n"+
            "})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n"+
            "ga('create', 'UA-41208993-1', 'kaymbu.com');\n"+
            "ga('send', 'pageview');</script></head><body><div id=\"action-container\" class=\"\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/5197c91bf92bf0020000000c/emailheader-1426779965305.png\" class=\"banner\"><div class=\"container-inner\"> <h1> <div class=\"selectAllBtn\"></div></h1><div class=\"media-container\"><div data-type=\"image\" data-id=\"5c2cfeb872590a001b53c6d1\" draggable=\"false\" class=\"media image selected\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb95881020000000f/images/40F43DBC-885B-497F-9266-89E074E624F7_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div></div></div><div class=\"action-bar\"><div class=\"processing-indicator\">Processing Your Order</div><div class=\"bar-content\"><div class=\"product\"><div class=\"title\">Format</div><select name=\"product\"><option value=\"download\">Digital (Free)<option value=\"4x6\">4x6 ($1)</option><option value=\"5x7\">5x7 ($2)</option><option value=\"8x10\">8x10 ($3)</option></option></select></div><div class=\"quantity\"><div class=\"title centered\">Copies</div><div class=\"upDownBtns down\"></div><input type=\"input\" name=\"quantity\" min=\"1\" max=\"512\" value=\"1\"><div class=\"upDownBtns up\"></div></div><div class=\"action-btn\"></div></div><div class=\"order-results\"><HEY>THERE!</HEY></div></div></div><script>window.enviroment = \"production\";\n"+
            "window.stripePublishKey = \"pk_live_bZ5CkHFKtZEN6LiNrMfygo2d\";\n"+
            "window.exportService = \"http://export.kaymbu.com\";\n"+
            "window.organizationId = \"5197c91bf92bf0020000000c\";\n"+
            "window.source = \"email\";\n"+
            "window.sourceId = \"5c2cff7881c10a000424ac9d\";\n"+
            "window.momentIds = [\"5c2cfeb872590a001b53c6d1\"];\n"+
            "window.products = [{\"id\":\"4x6\",\"name\":\"4x6\",\"price\":100,\"shippingPrice\":199},{\"id\":\"5x7\",\"name\":\"5x7\",\"price\":200,\"shippingPrice\":199},{\"id\":\"8x10\",\"name\":\"8x10\",\"price\":300,\"shippingPrice\":199}];\n"+
            "\n"+
            "</script><div id=\"sidr\"><div class=\"menu-container\"><ul><li class=\"menu-item moments\"><a href=\"/app/moments\"><div class=\"icon\"></div><span>Moments</span></a></li><li class=\"menu-item storyboards\"><a href=\"/storyboards\"><div class=\"icon\"></div><span>Storyboards</span></a></li><li class=\"menu-item messaging\"><a href=\"/app/messaging\"><div class=\"icon\"></div><span>Messaging</span></a></li><li class=\"divider\"><li class=\"menu-item manage\"><a href=\"/app/manage/classroom/null\"><div class=\"icon\"></div><span>Roster</span></a></li><li class=\"menu-item sent\"><a href=\"/app/sent\"><div class=\"icon manage\"></div><span>Sent Messages</span></a></li><li class=\"menu-item settings\"><a href=\"/app/settings/classroom/null\"><div class=\"icon email-digest\"></div><span>Email Settings</span></a></li></li><li class=\"divider\"></li><li class=\"menu-item help\"><a href=\"http://help.kaymbu.com\" target=\"_blank\"><div class=\"icon help\"></div><span>Help</span></a></li><li class=\"menu-item logout\"><a href=\"/admin/account/logout\"><div style=\"background-repeat: no-repeat; background-size: 15px; background-position: 8px\" class=\"icon logout\"></div><span>Logout</span></a></li></ul></div></div></body></html>";



    public static final String MULTI_IMG_PAGE = "<!DOCTYPE html><html><head><title>Kaymbu Moments</title><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><meta name=\"robots\" content=\"noindex, nofollow\"><meta name=\"robots\" content=\"noindex, nofollow\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><link rel=\"shortcut icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"apple-touch-icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon.png\"><link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-72.png\"><link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-114.png\"><link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-144.png\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/style.css?v=v1222\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/site.css?v=v1222\"><!-- HEADLESS--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/headless.css?v=v1222\"><link rel=\"stylesheet\" href=\"https://vjs.zencdn.net/4.1/video-js.css\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/moments/video.css?v=v1222\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/action/action.css?v=v1222\"><!-- Reskin!--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/reskin.css?v=v1222\"><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/utils/jquery-1.9.1.min.js?v=v1222\"></script><script>var KAYMBU = new function() {\n" +
            "\n" +
            "  var self = this;\n" +
            "  \n" +
            "  this.user = null;\n" +
            "  \n" +
            "  this.access = {\n" +
            "    account: null,\n" +
            "    accountPlan: null,\n" +
            "    hasAccountLimits: false,\n" +
            "    isAccountLimitReached: function(num, key) {\n" +
            "      if (!self.access.hasAccountLimits) {\n" +
            "        return false;\n" +
            "      }\n" +
            "      \n" +
            "      if (self.access.accountPlan.limits[key] === undefined) {\n" +
            "        return true;\n" +
            "      }\n" +
            "      \n" +
            "      var maxAllowed = this.accountPlan.limits[key];\n" +
            "      \n" +
            "      return num >= maxAllowed;\n" +
            "    },\n" +
            "  }\n" +
            "  \n" +
            "}();\n" +
            "</script><script>window.headless = true\n" +
            "\n" +
            "window.config = {\n" +
            "  enviroment: \"production\",\n" +
            "  headless: true\n" +
            "};\n" +
            "\n" +
            "window.nativeCall = function(callURL) {\n" +
            "  if (typeof window.headless == 'undefined' || !window.headless) return;\n" +
            "  var iframe = document.createElement(\"iframe\");\n" +
            "  iframe.setAttribute(\"src\", callURL);\n" +
            "  document.documentElement.appendChild(iframe);\n" +
            "  iframe.parentNode.removeChild(iframe);\n" +
            "  iframe = null;\n" +
            "};\n" +
            "</script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/libs/fastclick.js?v=v1222\"></script><script type=\"text/javascript\" src=\"//vjs.zencdn.net/4.1/video.js\"></script><script type=\"text/javascript\" src=\"//checkout.stripe.com/checkout.js\"></script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/action/actionPage.js?v=v1222\"></script><!-- Include google analytics because this page is rendered in headless mode--><!-- Which normally does -not- include ganalytics.--><script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
            "(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
            "m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
            "})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
            "ga('create', 'UA-41208993-1', 'kaymbu.com');\n" +
            "ga('send', 'pageview');</script></head><body><div id=\"action-container\" class=\"\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/5197c91bf92bf0020000000c/emailheader-1426779965305.png\" class=\"banner\"><div class=\"container-inner\"> <h1> <div class=\"selectAllBtn\"></div></h1><div class=\"media-container\"><div data-type=\"image\" data-id=\"5c2e5adc4d83c1001b4810a3\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/F1C1F158-52AB-4968-A2F5-A5958AF4A488_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5adcd22c8c001515b2f4\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/43A92EA9-BFBB-45C4-B63B-241487AB3799_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5add4e851b008a432a1c\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/685FF204-B899-4CD1-B95D-CFFF35CFD114_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5add941474008f0e4029\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/B6C79C86-178E-46C8-A876-43A5B00BDCA7_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5ade4e851b008a432a1d\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/E5D174C7-1469-481E-ADA3-5A29FE1ED30C_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5ade97e6f3009586be8b\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/7B296FAB-9909-4AF1-8169-9FFA668A4C39_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5adfbda7f201007b0f9f\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/CD4932CE-D954-4A2E-B1D7-70A422F29FAE_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5c2e5adff3af1d00bd2358ad\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000018/images/D6546BFF-A010-44F6-842F-6F0A034FA354_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div></div></div><div class=\"action-bar\"><div class=\"processing-indicator\">Processing Your Order</div><div class=\"bar-content\"><div class=\"product\"><div class=\"title\">Format</div><select name=\"product\"><option value=\"download\">Digital (Free)<option value=\"4x6\">4x6 ($1)</option><option value=\"5x7\">5x7 ($2)</option><option value=\"8x10\">8x10 ($3)</option></option></select></div><div class=\"quantity\"><div class=\"title centered\">Copies</div><div class=\"upDownBtns down\"></div><input type=\"input\" name=\"quantity\" min=\"1\" max=\"512\" value=\"1\"><div class=\"upDownBtns up\"></div></div><div class=\"action-btn\"></div></div><div class=\"order-results\"><HEY>THERE!</HEY></div></div></div><script>window.enviroment = \"production\";\n" +
            "window.stripePublishKey = \"pk_live_bZ5CkHFKtZEN6LiNrMfygo2d\";\n" +
            "window.exportService = \"http://export.kaymbu.com\";\n" +
            "window.organizationId = \"5197c91bf92bf0020000000c\";\n" +
            "window.source = \"email\";\n" +
            "window.sourceId = \"5c2e5bc934bde80004475900\";\n" +
            "window.momentIds = [\"5c2e5adc4d83c1001b4810a3\",\"5c2e5adcd22c8c001515b2f4\",\"5c2e5add4e851b008a432a1c\",\"5c2e5add941474008f0e4029\",\"5c2e5ade4e851b008a432a1d\",\"5c2e5ade97e6f3009586be8b\",\"5c2e5adfbda7f201007b0f9f\",\"5c2e5adff3af1d00bd2358ad\"];\n" +
            "window.products = [{\"id\":\"4x6\",\"name\":\"4x6\",\"price\":100,\"shippingPrice\":199},{\"id\":\"5x7\",\"name\":\"5x7\",\"price\":200,\"shippingPrice\":199},{\"id\":\"8x10\",\"name\":\"8x10\",\"price\":300,\"shippingPrice\":199}];\n" +
            "\n" +
            "</script><div id=\"sidr\"><div class=\"menu-container\"><ul><li class=\"menu-item moments\"><a href=\"/app/moments\"><div class=\"icon\"></div><span>Moments</span></a></li><li class=\"menu-item storyboards\"><a href=\"/storyboards\"><div class=\"icon\"></div><span>Storyboards</span></a></li><li class=\"menu-item messaging\"><a href=\"/app/messaging\"><div class=\"icon\"></div><span>Messaging</span></a></li><li class=\"divider\"><li class=\"menu-item manage\"><a href=\"/app/manage/classroom/null\"><div class=\"icon\"></div><span>Roster</span></a></li><li class=\"menu-item sent\"><a href=\"/app/sent\"><div class=\"icon manage\"></div><span>Sent Messages</span></a></li><li class=\"menu-item settings\"><a href=\"/app/settings/classroom/null\"><div class=\"icon email-digest\"></div><span>Email Settings</span></a></li></li><li class=\"divider\"></li><li class=\"menu-item help\"><a href=\"http://help.kaymbu.com\" target=\"_blank\"><div class=\"icon help\"></div><span>Help</span></a></li><li class=\"menu-item logout\"><a href=\"/admin/account/logout\"><div style=\"background-repeat: no-repeat; background-size: 15px; background-position: 8px\" class=\"icon logout\"></div><span>Logout</span></a></li></ul></div></div></body></html>";


    public static final String SINGLE_VIDEO_PAGE = "<!DOCTYPE html><html><head><title>Video</title><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><meta name=\"robots\" content=\"noindex, nofollow\"><link rel=\"shortcut icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"apple-touch-icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon.png\"><link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-72.png\"><link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-114.png\"><link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-144.png\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/style.css?v=v1224\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/site.css?v=v1224\"><!-- NOT HEADLESS--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/libs/sidr/jquery.sidr.dark.css?v=v1224\"><link rel=\"stylesheet\" href=\"https://vjs.zencdn.net/4.2/video-js.css\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/moments/video.css?v=v1224\"><!-- Reskin!--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/reskin.css?v=v1224\"><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/utils/jquery-1.9.1.min.js?v=v1224\"></script><script>var KAYMBU = new function() {\n" +
            "\n" +
            "  var self = this;\n" +
            "  \n" +
            "  this.user = null;\n" +
            "  \n" +
            "  this.access = {\n" +
            "    account: null,\n" +
            "    accountPlan: null,\n" +
            "    hasAccountLimits: false,\n" +
            "    isAccountLimitReached: function(num, key) {\n" +
            "      if (!self.access.hasAccountLimits) {\n" +
            "        return false;\n" +
            "      }\n" +
            "      \n" +
            "      if (self.access.accountPlan.limits[key] === undefined) {\n" +
            "        return true;\n" +
            "      }\n" +
            "      \n" +
            "      var maxAllowed = this.accountPlan.limits[key];\n" +
            "      \n" +
            "      return num >= maxAllowed;\n" +
            "    },\n" +
            "  }\n" +
            "  \n" +
            "}();\n" +
            "</script><script>window.headless = false\n" +
            "\n" +
            "window.config = {\n" +
            "  enviroment: \"production\",\n" +
            "  headless: false\n" +
            "};\n" +
            "\n" +
            "window.nativeCall = function(callURL) {\n" +
            "  if (typeof window.headless == 'undefined' || !window.headless) return;\n" +
            "  var iframe = document.createElement(\"iframe\");\n" +
            "  iframe.setAttribute(\"src\", callURL);\n" +
            "  document.documentElement.appendChild(iframe);\n" +
            "  iframe.parentNode.removeChild(iframe);\n" +
            "  iframe = null;\n" +
            "};\n" +
            "</script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/menu.js?v=v1224\"></script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/libs/sidr/jquery.sidr.min.js?v=v1224\"></script><script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
            "(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
            "m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
            "})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
            "ga('create', 'UA-41208993-1', 'kaymbu.com');\n" +
            "ga('send', 'pageview');</script><script type=\"text/javascript\" src=\"https://vjs.zencdn.net/4.2/video.js\"></script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/moments/video.js?v=v1224\"></script><script>var _poster = \"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000016/videos/video-still-5bad73f82719b9001abc0d6a.png\";\n" +
            "var _video = \"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000016/videos/low-5bad73f82719b9001abc0d6a.mp4\";\n" +
            "videojs.options.flash.swf = \"https://vjs.zencdn.net/4.2/video-js.swf\"\n" +
            "</script></head><body><div class=\"top-nav\"><div class=\"container\"><h3 class=\"title\">Video</h3><div class=\"logo\"></div><div class=\"filter\"></div></div></div><br><div class=\"video-container\"></div><a href=\"http://export.kaymbu.com/download/moments/?5bad73f82719b9001abc0d6a\" class=\"download-btn\">Download</a><div id=\"sidr\"><div class=\"menu-container\"><ul><li class=\"menu-item moments\"><a href=\"/app/moments\"><div class=\"icon\"></div><span>Moments</span></a></li><li class=\"menu-item storyboards\"><a href=\"/storyboards\"><div class=\"icon\"></div><span>Storyboards</span></a></li><li class=\"menu-item messaging\"><a href=\"/app/messaging\"><div class=\"icon\"></div><span>Messaging</span></a></li><li class=\"divider\"><li class=\"menu-item manage\"><a href=\"/app/manage/classroom/null\"><div class=\"icon\"></div><span>Roster</span></a></li><li class=\"menu-item sent\"><a href=\"/app/sent\"><div class=\"icon manage\"></div><span>Sent Messages</span></a></li><li class=\"menu-item settings\"><a href=\"/app/settings/classroom/null\"><div class=\"icon email-digest\"></div><span>Email Settings</span></a></li></li><li class=\"divider\"></li><li class=\"menu-item help\"><a href=\"http://help.kaymbu.com\" target=\"_blank\"><div class=\"icon help\"></div><span>Help</span></a></li><li class=\"menu-item logout\"><a href=\"/admin/account/logout\"><div style=\"background-repeat: no-repeat; background-size: 15px; background-position: 8px\" class=\"icon logout\"></div><span>Logout</span></a></li></ul></div></div></body></html>";

    public static final String MIXED_VIDEOS_AND_IMAGES_PAGE = "\n" +
            "<!DOCTYPE html><html><head><title>Kaymbu Moments</title><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><meta name=\"robots\" content=\"noindex, nofollow\"><meta name=\"robots\" content=\"noindex, nofollow\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\"><link rel=\"shortcut icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\"><link rel=\"apple-touch-icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon.png\"><link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-72.png\"><link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-114.png\"><link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-144.png\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/style.css?v=v1224\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/site.css?v=v1224\"><!-- HEADLESS--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/headless.css?v=v1224\"><link rel=\"stylesheet\" href=\"https://vjs.zencdn.net/4.1/video-js.css\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/moments/video.css?v=v1224\"><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/action/action.css?v=v1224\"><!-- Reskin!--><link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/reskin.css?v=v1224\"><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/utils/jquery-1.9.1.min.js?v=v1224\"></script><script>var KAYMBU = new function() {\n" +
            "\n" +
            "  var self = this;\n" +
            "  \n" +
            "  this.user = null;\n" +
            "  \n" +
            "  this.access = {\n" +
            "    account: null,\n" +
            "    accountPlan: null,\n" +
            "    hasAccountLimits: false,\n" +
            "    isAccountLimitReached: function(num, key) {\n" +
            "      if (!self.access.hasAccountLimits) {\n" +
            "        return false;\n" +
            "      }\n" +
            "      \n" +
            "      if (self.access.accountPlan.limits[key] === undefined) {\n" +
            "        return true;\n" +
            "      }\n" +
            "      \n" +
            "      var maxAllowed = this.accountPlan.limits[key];\n" +
            "      \n" +
            "      return num >= maxAllowed;\n" +
            "    },\n" +
            "  }\n" +
            "  \n" +
            "}();\n" +
            "</script><script>window.headless = true\n" +
            "\n" +
            "window.config = {\n" +
            "  enviroment: \"production\",\n" +
            "  headless: true\n" +
            "};\n" +
            "\n" +
            "window.nativeCall = function(callURL) {\n" +
            "  if (typeof window.headless == 'undefined' || !window.headless) return;\n" +
            "  var iframe = document.createElement(\"iframe\");\n" +
            "  iframe.setAttribute(\"src\", callURL);\n" +
            "  document.documentElement.appendChild(iframe);\n" +
            "  iframe.parentNode.removeChild(iframe);\n" +
            "  iframe = null;\n" +
            "};\n" +
            "</script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/libs/fastclick.js?v=v1224\"></script><script type=\"text/javascript\" src=\"//vjs.zencdn.net/4.1/video.js\"></script><script type=\"text/javascript\" src=\"//checkout.stripe.com/checkout.js\"></script><script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/action/actionPage.js?v=v1224\"></script><!-- Include google analytics because this page is rendered in headless mode--><!-- Which normally does -not- include ganalytics.--><script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
            "(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
            "m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
            "})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
            "ga('create', 'UA-41208993-1', 'kaymbu.com');\n" +
            "ga('send', 'pageview');</script></head><body><div id=\"action-container\" class=\"\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/5197c91bf92bf0020000000c/emailheader-1426779965305.png\" class=\"banner\"><div class=\"container-inner\"> <h1> <div class=\"selectAllBtn\"></div></h1><div class=\"media-container\"><div data-type=\"video\" data-id=\"5afc83a271d09100149051ae\" class=\"media video\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/videos/video-still-5afc83a271d09100149051ae.png\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div><div class=\"video-overlay\"></div></div><div data-type=\"video\" data-id=\"5afc83a370ec5d0013c599d1\" class=\"media video\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/videos/video-still-5afc83a370ec5d0013c599d1.png\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div><div class=\"video-overlay\"></div></div><div data-type=\"video\" data-id=\"5afc83a474d2e70013843ef2\" class=\"media video\"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/videos/video-still-5afc83a474d2e70013843ef2.png\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div><div class=\"video-overlay\"></div></div><div data-type=\"image\" data-id=\"5afc83bd74d2e70013843f4a\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/images/47229640-3A8C-40BB-9026-8DFA0C51EE51_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5afc83bd8c17a20018842c59\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/images/903E4DB5-C98E-423D-984F-DDEF47C2625C_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5afc83be74d2e70013843f4b\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/images/70355E84-BFE8-4360-90AA-A21A7BC83B6F_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5afc83bef452810019a8b481\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/images/3E5A87FD-D905-4FD2-A053-E1E36CE3DF21_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div><div data-type=\"image\" data-id=\"5afc83bf70ec5d0013c599d2\" draggable=\"false\" class=\"media image \"><img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb958810200000015/images/50086C1B-A8FA-4A69-9ACA-AFF66B7497B5_thumb.jpg\" alt=\"\" class=\"moment-img\"><div class=\"selected-overlay\"></div></div></div></div><div class=\"action-bar\"><div class=\"processing-indicator\">Processing Your Order</div><div class=\"bar-content\"><div class=\"product\"><div class=\"title\">Format</div><select name=\"product\"><option value=\"download\">Digital (Free)<option value=\"4x6\">4x6 ($1)</option><option value=\"5x7\">5x7 ($2)</option><option value=\"8x10\">8x10 ($3)</option></option></select></div><div class=\"quantity\"><div class=\"title centered\">Copies</div><div class=\"upDownBtns down\"></div><input type=\"input\" name=\"quantity\" min=\"1\" max=\"512\" value=\"1\"><div class=\"upDownBtns up\"></div></div><div class=\"action-btn\"></div></div><div class=\"order-results\"><HEY>THERE!</HEY></div></div></div><script>window.enviroment = \"production\";\n" +
            "window.stripePublishKey = \"pk_live_bZ5CkHFKtZEN6LiNrMfygo2d\";\n" +
            "window.exportService = \"http://export.kaymbu.com\";\n" +
            "window.organizationId = \"5197c91bf92bf0020000000c\";\n" +
            "window.source = \"email\";\n" +
            "window.sourceId = \"5afc846454fcf20004dbf0c1\";\n" +
            "window.momentIds = [\"5afc83a271d09100149051ae\",\"5afc83a370ec5d0013c599d1\",\"5afc83a474d2e70013843ef2\",\"5afc83bd74d2e70013843f4a\",\"5afc83bd8c17a20018842c59\",\"5afc83be74d2e70013843f4b\",\"5afc83bef452810019a8b481\",\"5afc83bf70ec5d0013c599d2\"];\n" +
            "window.products = [{\"id\":\"4x6\",\"name\":\"4x6\",\"price\":100,\"shippingPrice\":199},{\"id\":\"5x7\",\"name\":\"5x7\",\"price\":200,\"shippingPrice\":199},{\"id\":\"8x10\",\"name\":\"8x10\",\"price\":300,\"shippingPrice\":199}];\n" +
            "\n" +
            "</script><div id=\"sidr\"><div class=\"menu-container\"><ul><li class=\"menu-item moments\"><a href=\"/app/moments\"><div class=\"icon\"></div><span>Moments</span></a></li><li class=\"menu-item storyboards\"><a href=\"/storyboards\"><div class=\"icon\"></div><span>Storyboards</span></a></li><li class=\"menu-item messaging\"><a href=\"/app/messaging\"><div class=\"icon\"></div><span>Messaging</span></a></li><li class=\"divider\"><li class=\"menu-item manage\"><a href=\"/app/manage/classroom/null\"><div class=\"icon\"></div><span>Roster</span></a></li><li class=\"menu-item sent\"><a href=\"/app/sent\"><div class=\"icon manage\"></div><span>Sent Messages</span></a></li><li class=\"menu-item settings\"><a href=\"/app/settings/classroom/null\"><div class=\"icon email-digest\"></div><span>Email Settings</span></a></li></li><li class=\"divider\"></li><li class=\"menu-item help\"><a href=\"http://help.kaymbu.com\" target=\"_blank\"><div class=\"icon help\"></div><span>Help</span></a></li><li class=\"menu-item logout\"><a href=\"/admin/account/logout\"><div style=\"background-repeat: no-repeat; background-size: 15px; background-position: 8px\" class=\"icon logout\"></div><span>Logout</span></a></li></ul></div></div></body></html>";

    public static final String MULTI_VIDEO_PAGE = "<!doctype html>\n" +
            "<html>\n" +
            " <head>\n" +
            "  <title>Kaymbu Moments</title>\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n" +
            "  <meta name=\"robots\" content=\"noindex, nofollow\">\n" +
            "  <meta name=\"robots\" content=\"noindex, nofollow\">\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n" +
            "  <link rel=\"shortcut icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\">\n" +
            "  <link rel=\"icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/favicon.ico\" type=\"image/x-icon\">\n" +
            "  <link rel=\"apple-touch-icon\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon.png\">\n" +
            "  <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-72.png\">\n" +
            "  <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-114.png\">\n" +
            "  <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"https://d2hi0kftpcoddq.cloudfront.net/apple-touch-icon-144.png\">\n" +
            "  <link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/style.css?v=v1224\">\n" +
            "  <link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/site.css?v=v1224\">\n" +
            "  <!-- HEADLESS-->\n" +
            "  <link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/headless.css?v=v1224\">\n" +
            "  <link rel=\"stylesheet\" href=\"https://vjs.zencdn.net/4.1/video-js.css\">\n" +
            "  <link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/moments/video.css?v=v1224\">\n" +
            "  <link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/action/action.css?v=v1224\">\n" +
            "  <!-- Reskin!-->\n" +
            "  <link rel=\"stylesheet\" href=\"https://d2hi0kftpcoddq.cloudfront.net/stylesheets/site/reskin.css?v=v1224\">\n" +
            "  <script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/utils/jquery-1.9.1.min.js?v=v1224\"></script>\n" +
            "  <script>var KAYMBU = new function() {\n" +
            "\n" +
            "  var self = this;\n" +
            "  \n" +
            "  this.user = null;\n" +
            "  \n" +
            "  this.access = {\n" +
            "    account: null,\n" +
            "    accountPlan: null,\n" +
            "    hasAccountLimits: false,\n" +
            "    isAccountLimitReached: function(num, key) {\n" +
            "      if (!self.access.hasAccountLimits) {\n" +
            "        return false;\n" +
            "      }\n" +
            "      \n" +
            "      if (self.access.accountPlan.limits[key] === undefined) {\n" +
            "        return true;\n" +
            "      }\n" +
            "      \n" +
            "      var maxAllowed = this.accountPlan.limits[key];\n" +
            "      \n" +
            "      return num >= maxAllowed;\n" +
            "    },\n" +
            "  }\n" +
            "  \n" +
            "}();\n" +
            "</script>\n" +
            "  <script>window.headless = true\n" +
            "\n" +
            "window.config = {\n" +
            "  enviroment: \"production\",\n" +
            "  headless: true\n" +
            "};\n" +
            "\n" +
            "window.nativeCall = function(callURL) {\n" +
            "  if (typeof window.headless == 'undefined' || !window.headless) return;\n" +
            "  var iframe = document.createElement(\"iframe\");\n" +
            "  iframe.setAttribute(\"src\", callURL);\n" +
            "  document.documentElement.appendChild(iframe);\n" +
            "  iframe.parentNode.removeChild(iframe);\n" +
            "  iframe = null;\n" +
            "};\n" +
            "</script>\n" +
            "  <script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/libs/fastclick.js?v=v1224\"></script>\n" +
            "  <script type=\"text/javascript\" src=\"//vjs.zencdn.net/4.1/video.js\"></script>\n" +
            "  <script type=\"text/javascript\" src=\"//checkout.stripe.com/checkout.js\"></script>\n" +
            "  <script type=\"text/javascript\" src=\"https://d2hi0kftpcoddq.cloudfront.net/javascripts/action/actionPage.js?v=v1224\"></script>\n" +
            "  <!-- Include google analytics because this page is rendered in headless mode-->\n" +
            "  <!-- Which normally does -not- include ganalytics.-->\n" +
            "  <script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
            "(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
            "m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
            "})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
            "ga('create', 'UA-41208993-1', 'kaymbu.com');\n" +
            "ga('send', 'pageview');</script>\n" +
            " </head>\n" +
            " <body>\n" +
            "  <div id=\"action-container\" class=\"no-merch\">\n" +
            "   <img src=\"https://d2k9f6tk478nyp.cloudfront.net/5197c91bf92bf0020000000c/emailheader-1426779965305.png\" class=\"banner\">\n" +
            "   <div class=\"container-inner\"> \n" +
            "    <h1> \n" +
            "     <div class=\"selectAllBtn\"></div></h1>\n" +
            "    <div class=\"media-container\">\n" +
            "     <div data-type=\"video\" data-id=\"5c1a8ad8d162d1001560135b\" class=\"media video\">\n" +
            "      <img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb95881020000000f/videos/video-still-5c1a8ad8d162d1001560135b.png\" alt=\"\" class=\"moment-img\">\n" +
            "      <div class=\"selected-overlay\"></div>\n" +
            "      <div class=\"video-overlay\"></div>\n" +
            "     </div>\n" +
            "     <div data-type=\"video\" data-id=\"5c1a8b27d38a230014bade75\" class=\"media video\">\n" +
            "      <img src=\"https://d2k9f6tk478nyp.cloudfront.net/moments/522d1efbb95881020000000f/videos/video-still-5c1a8b27d38a230014bade75.png\" alt=\"\" class=\"moment-img\">\n" +
            "      <div class=\"selected-overlay\"></div>\n" +
            "      <div class=\"video-overlay\"></div>\n" +
            "     </div>\n" +
            "    </div>\n" +
            "   </div>\n" +
            "   <div class=\"action-bar\">\n" +
            "    <div class=\"processing-indicator\">\n" +
            "     Processing Your Order\n" +
            "    </div>\n" +
            "    <div class=\"bar-content\">\n" +
            "     <div class=\"product\">\n" +
            "      <div class=\"title\">\n" +
            "       Format\n" +
            "      </div>\n" +
            "      <select name=\"product\"><option value=\"download\">Digital (Free)</option></select>\n" +
            "     </div>\n" +
            "     <div class=\"quantity\">\n" +
            "      <div class=\"title centered\">\n" +
            "       Copies\n" +
            "      </div>\n" +
            "      <div class=\"upDownBtns down\"></div>\n" +
            "      <input type=\"input\" name=\"quantity\" min=\"1\" max=\"512\" value=\"1\">\n" +
            "      <div class=\"upDownBtns up\"></div>\n" +
            "     </div>\n" +
            "     <div class=\"action-btn\"></div>\n" +
            "    </div>\n" +
            "    <div class=\"order-results\">\n" +
            "     <hey>\n" +
            "      THERE!\n" +
            "     </hey>\n" +
            "    </div>\n" +
            "   </div>\n" +
            "  </div>\n" +
            "  <script>window.enviroment = \"production\";\n" +
            "window.stripePublishKey = \"pk_live_bZ5CkHFKtZEN6LiNrMfygo2d\";\n" +
            "window.exportService = \"http://export.kaymbu.com\";\n" +
            "window.organizationId = \"5197c91bf92bf0020000000c\";\n" +
            "window.source = \"email\";\n" +
            "window.sourceId = \"5c1a8bb67e43a90004370895\";\n" +
            "window.momentIds = [\"5c1a8ad8d162d1001560135b\",\"5c1a8b27d38a230014bade75\"];\n" +
            "window.products = [{\"id\":\"4x6\",\"name\":\"4x6\",\"price\":100,\"shippingPrice\":199},{\"id\":\"5x7\",\"name\":\"5x7\",\"price\":200,\"shippingPrice\":199},{\"id\":\"8x10\",\"name\":\"8x10\",\"price\":300,\"shippingPrice\":199}];\n" +
            "\n" +
            "</script>\n" +
            "  <div id=\"sidr\">\n" +
            "   <div class=\"menu-container\">\n" +
            "    <ul>\n" +
            "     <li class=\"menu-item moments\"><a href=\"/app/moments\">\n" +
            "       <div class=\"icon\"></div><span>Moments</span></a></li>\n" +
            "     <li class=\"menu-item storyboards\"><a href=\"/storyboards\">\n" +
            "       <div class=\"icon\"></div><span>Storyboards</span></a></li>\n" +
            "     <li class=\"menu-item messaging\"><a href=\"/app/messaging\">\n" +
            "       <div class=\"icon\"></div><span>Messaging</span></a></li>\n" +
            "     <li class=\"divider\"></li>\n" +
            "     <li class=\"menu-item manage\"><a href=\"/app/manage/classroom/null\">\n" +
            "       <div class=\"icon\"></div><span>Roster</span></a></li>\n" +
            "     <li class=\"menu-item sent\"><a href=\"/app/sent\">\n" +
            "       <div class=\"icon manage\"></div><span>Sent Messages</span></a></li>\n" +
            "     <li class=\"menu-item settings\"><a href=\"/app/settings/classroom/null\">\n" +
            "       <div class=\"icon email-digest\"></div><span>Email Settings</span></a></li>\n" +
            "     <li class=\"divider\"></li>\n" +
            "     <li class=\"menu-item help\"><a href=\"http://help.kaymbu.com\" target=\"_blank\">\n" +
            "       <div class=\"icon help\"></div><span>Help</span></a></li>\n" +
            "     <li class=\"menu-item logout\"><a href=\"/admin/account/logout\">\n" +
            "       <div style=\"background-repeat: no-repeat; background-size: 15px; background-position: 8px\" class=\"icon logout\"></div><span>Logout</span></a></li>\n" +
            "    </ul>\n" +
            "   </div>\n" +
            "  </div>\n" +
            " </body>\n" +
            "</html>";

    public static void main(String[] args)
    {
        System.out.println(MIXED_VIDEOS_AND_IMAGES_PAGE);
    }
}
