package app.chalo.deeplink;

import app.chalo.scenes.ChaloNavigationRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/deeplink/DeepLinkGuardResult;", "", "Allow", "Redirect", "Consumed", "Lapp/chalo/deeplink/DeepLinkGuardResult$Allow;", "Lapp/chalo/deeplink/DeepLinkGuardResult$Consumed;", "Lapp/chalo/deeplink/DeepLinkGuardResult$Redirect;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeepLinkGuardResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkGuardResult$Allow;", "Lapp/chalo/deeplink/DeepLinkGuardResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Allow implements DeepLinkGuardResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeepLinkResolutionResult f2448a;

        public Allow(DeepLinkResolutionResult result) {
            Intrinsics.i(result, "result");
            this.f2448a = result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Allow) && Intrinsics.d(this.f2448a, ((Allow) obj).f2448a);
        }

        public final int hashCode() {
            return this.f2448a.hashCode();
        }

        public final String toString() {
            return "Allow(result=" + this.f2448a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkGuardResult$Consumed;", "Lapp/chalo/deeplink/DeepLinkGuardResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Consumed implements DeepLinkGuardResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Consumed f2449a = new Consumed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Consumed);
        }

        public final int hashCode() {
            return -171121722;
        }

        public final String toString() {
            return "Consumed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkGuardResult$Redirect;", "Lapp/chalo/deeplink/DeepLinkGuardResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Redirect implements DeepLinkGuardResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloNavigationRequest f2450a;

        public Redirect(ChaloNavigationRequest chaloNavigationRequest) {
            this.f2450a = chaloNavigationRequest;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Redirect) && Intrinsics.d(this.f2450a, ((Redirect) obj).f2450a);
        }

        public final int hashCode() {
            return this.f2450a.hashCode();
        }

        public final String toString() {
            return "Redirect(navigationRequest=" + this.f2450a + ")";
        }
    }
}
