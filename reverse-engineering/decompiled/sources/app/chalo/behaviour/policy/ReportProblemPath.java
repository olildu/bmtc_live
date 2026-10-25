package app.chalo.behaviour.policy;

import app.chalo.scenes.args.WebViewArgs;
import defpackage.vo1;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/behaviour/policy/ReportProblemPath;", "", "FreshChatPath", "WebViewPath", "WhatsAppPath", "Lapp/chalo/behaviour/policy/ReportProblemPath$FreshChatPath;", "Lapp/chalo/behaviour/policy/ReportProblemPath$WebViewPath;", "Lapp/chalo/behaviour/policy/ReportProblemPath$WhatsAppPath;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReportProblemPath {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ReportProblemPath$FreshChatPath;", "Lapp/chalo/behaviour/policy/ReportProblemPath;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FreshChatPath extends ReportProblemPath {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FreshChatPath f1032a = new FreshChatPath();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ReportProblemPath$WebViewPath;", "Lapp/chalo/behaviour/policy/ReportProblemPath;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebViewPath extends ReportProblemPath {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebViewArgs f1033a;

        public WebViewPath(WebViewArgs webViewArgs) {
            this.f1033a = webViewArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebViewPath) && Intrinsics.d(this.f1033a, ((WebViewPath) obj).f1033a);
        }

        public final int hashCode() {
            return this.f1033a.hashCode();
        }

        public final String toString() {
            return "WebViewPath(webViewArgs=" + this.f1033a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ReportProblemPath$WhatsAppPath;", "Lapp/chalo/behaviour/policy/ReportProblemPath;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WhatsAppPath extends ReportProblemPath {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1034a;

        public WhatsAppPath(String phoneNumber) {
            Intrinsics.i(phoneNumber, "phoneNumber");
            this.f1034a = phoneNumber;
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            String str = this.f1034a;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            return vo1.m("https://wa.me/", sb.toString());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WhatsAppPath) && Intrinsics.d(this.f1034a, ((WhatsAppPath) obj).f1034a);
        }

        public final int hashCode() {
            return this.f1034a.hashCode();
        }

        public final String toString() {
            return vo1.B("WhatsAppPath(phoneNumber=", this.f1034a, ")");
        }
    }
}
