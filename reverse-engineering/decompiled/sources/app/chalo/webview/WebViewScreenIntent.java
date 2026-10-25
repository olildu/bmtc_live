package app.chalo.webview;

import defpackage.b3;
import defpackage.dd;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent;", "", "InitialisationIntent", "WebPageLoadProgress", "WebPageLoadFinishedIntent", "ProcessAppLinkLoadTriggeredIntent", "ProcessDeepLinkLoadTriggeredIntent", "WebViewLoadErrorReceivedIntent", "Lapp/chalo/webview/WebViewScreenIntent$InitialisationIntent;", "Lapp/chalo/webview/WebViewScreenIntent$ProcessAppLinkLoadTriggeredIntent;", "Lapp/chalo/webview/WebViewScreenIntent$ProcessDeepLinkLoadTriggeredIntent;", "Lapp/chalo/webview/WebViewScreenIntent$WebPageLoadFinishedIntent;", "Lapp/chalo/webview/WebViewScreenIntent$WebPageLoadProgress;", "Lapp/chalo/webview/WebViewScreenIntent$WebViewLoadErrorReceivedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebViewScreenIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent$InitialisationIntent;", "Lapp/chalo/webview/WebViewScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends WebViewScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11107a;
        public final String b;
        public final boolean c;

        public InitialisationIntent(String str, String str2, boolean z) {
            this.f11107a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return Intrinsics.d(this.f11107a, initialisationIntent.f11107a) && Intrinsics.d(this.b, initialisationIntent.b) && this.c == initialisationIntent.c;
        }

        public final int hashCode() {
            String str = this.f11107a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            return b3.g(")", dd.e("InitialisationIntent(url=", this.f11107a, ", name=", this.b, ", hideActionBar="), this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent$ProcessAppLinkLoadTriggeredIntent;", "Lapp/chalo/webview/WebViewScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessAppLinkLoadTriggeredIntent extends WebViewScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11108a;

        public ProcessAppLinkLoadTriggeredIntent(String url) {
            Intrinsics.i(url, "url");
            this.f11108a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessAppLinkLoadTriggeredIntent) && Intrinsics.d(this.f11108a, ((ProcessAppLinkLoadTriggeredIntent) obj).f11108a);
        }

        public final int hashCode() {
            return this.f11108a.hashCode();
        }

        public final String toString() {
            return vo1.B("ProcessAppLinkLoadTriggeredIntent(url=", this.f11108a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent$ProcessDeepLinkLoadTriggeredIntent;", "Lapp/chalo/webview/WebViewScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessDeepLinkLoadTriggeredIntent extends WebViewScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11109a;

        public ProcessDeepLinkLoadTriggeredIntent(String url) {
            Intrinsics.i(url, "url");
            this.f11109a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessDeepLinkLoadTriggeredIntent) && Intrinsics.d(this.f11109a, ((ProcessDeepLinkLoadTriggeredIntent) obj).f11109a);
        }

        public final int hashCode() {
            return this.f11109a.hashCode();
        }

        public final String toString() {
            return vo1.B("ProcessDeepLinkLoadTriggeredIntent(url=", this.f11109a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent$WebPageLoadFinishedIntent;", "Lapp/chalo/webview/WebViewScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebPageLoadFinishedIntent extends WebViewScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebPageLoadFinishedIntent f11110a = new WebPageLoadFinishedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WebPageLoadFinishedIntent);
        }

        public final int hashCode() {
            return 1600801145;
        }

        public final String toString() {
            return "WebPageLoadFinishedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent$WebPageLoadProgress;", "Lapp/chalo/webview/WebViewScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebPageLoadProgress extends WebViewScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f11111a;

        public WebPageLoadProgress(float f) {
            this.f11111a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebPageLoadProgress) && Float.compare(this.f11111a, ((WebPageLoadProgress) obj).f11111a) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f11111a);
        }

        public final String toString() {
            return "WebPageLoadProgress(progress=" + this.f11111a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenIntent$WebViewLoadErrorReceivedIntent;", "Lapp/chalo/webview/WebViewScreenIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebViewLoadErrorReceivedIntent extends WebViewScreenIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11112a;
        public final String b;
        public final Integer c;

        public WebViewLoadErrorReceivedIntent(Integer num, String url, String str) {
            Intrinsics.i(url, "url");
            this.f11112a = url;
            this.b = str;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewLoadErrorReceivedIntent)) {
                return false;
            }
            WebViewLoadErrorReceivedIntent webViewLoadErrorReceivedIntent = (WebViewLoadErrorReceivedIntent) obj;
            return Intrinsics.d(this.f11112a, webViewLoadErrorReceivedIntent.f11112a) && Intrinsics.d(this.b, webViewLoadErrorReceivedIntent.b) && Intrinsics.d(this.c, webViewLoadErrorReceivedIntent.c);
        }

        public final int hashCode() {
            int iHashCode = this.f11112a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return pk0.k(dd.e("WebViewLoadErrorReceivedIntent(url=", this.f11112a, ", msg=", this.b, ", code="), this.c, ")");
        }
    }
}
