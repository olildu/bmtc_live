package app.chalo.ads;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.r30;
import defpackage.vo1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult;", "", InitializationStatus.SUCCESS, "Failed", "Lapp/chalo/ads/BindNativeAdResult$Failed;", "Lapp/chalo/ads/BindNativeAdResult$Success;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BindNativeAdResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult$Failed;", "Lapp/chalo/ads/BindNativeAdResult;", "SDKLoadAdError", "UnsupportedAspectRatio", "NoAdMediaContent", "NoAdHeadlineAvailable", "Lapp/chalo/ads/BindNativeAdResult$Failed$NoAdHeadlineAvailable;", "Lapp/chalo/ads/BindNativeAdResult$Failed$NoAdMediaContent;", "Lapp/chalo/ads/BindNativeAdResult$Failed$SDKLoadAdError;", "Lapp/chalo/ads/BindNativeAdResult$Failed$UnsupportedAspectRatio;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Failed extends BindNativeAdResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f753a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult$Failed$NoAdHeadlineAvailable;", "Lapp/chalo/ads/BindNativeAdResult$Failed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoAdHeadlineAvailable extends Failed {
            public static final NoAdHeadlineAvailable b = new NoAdHeadlineAvailable("No_Ad_Headline_Available");
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult$Failed$NoAdMediaContent;", "Lapp/chalo/ads/BindNativeAdResult$Failed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoAdMediaContent extends Failed {
            public static final NoAdMediaContent b = new NoAdMediaContent("No_Ad_Media_Content");
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult$Failed$SDKLoadAdError;", "Lapp/chalo/ads/BindNativeAdResult$Failed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SDKLoadAdError extends Failed {
            public final String b;

            public SDKLoadAdError(String str) {
                super(str == null ? "" : str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SDKLoadAdError) && Intrinsics.d(this.b, ((SDKLoadAdError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("SDKLoadAdError(msg=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult$Failed$UnsupportedAspectRatio;", "Lapp/chalo/ads/BindNativeAdResult$Failed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnsupportedAspectRatio extends Failed {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnsupportedAspectRatio) && Float.compare(0.0f, 0.0f) == 0;
            }

            public final int hashCode() {
                return Float.floatToIntBits(0.0f);
            }

            public final String toString() {
                return "UnsupportedAspectRatio(adAspectRatio=0.0)";
            }
        }

        public Failed(String str) {
            this.f753a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/BindNativeAdResult$Success;", "Lapp/chalo/ads/BindNativeAdResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends BindNativeAdResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f754a;
        public final float b;
        public final String c;

        public Success(LinkedHashMap linkedHashMap, float f, String loadSource) {
            Intrinsics.i(loadSource, "loadSource");
            this.f754a = linkedHashMap;
            this.b = f;
            this.c = loadSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.f754a.equals(success.f754a) && Float.compare(this.b, success.b) == 0 && Intrinsics.d(this.c, success.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + r30.a(this.b, this.f754a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(additionalInfoReceivedFromAd=");
            sb.append(this.f754a);
            sb.append(", mediaAspectRatio=");
            sb.append(this.b);
            sb.append(", loadSource=");
            return vo1.p(sb, this.c, ")");
        }
    }
}
