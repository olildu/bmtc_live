package app.chalo.ads;

import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ads/UnifiedAdHostValidationError;", "", "UnsupportedHostMode", "Lapp/chalo/ads/UnifiedAdHostValidationError$UnsupportedHostMode;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UnifiedAdHostValidationError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdHostValidationError$UnsupportedHostMode;", "Lapp/chalo/ads/UnifiedAdHostValidationError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnsupportedHostMode implements UnifiedAdHostValidationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdSlot f842a;
        public final UnifiedAdHostMode b;
        public final UnifiedAdHostMode c;
        public final String d;

        public UnsupportedHostMode(UnifiedAdSlot slot, UnifiedAdHostMode hostMode, UnifiedAdHostMode supportedHostMode) {
            Intrinsics.i(slot, "slot");
            Intrinsics.i(hostMode, "hostMode");
            Intrinsics.i(supportedHostMode, "supportedHostMode");
            this.f842a = slot;
            this.b = hostMode;
            this.c = supportedHostMode;
            this.d = z40.g("unsupported_host_mode:", slot.name(), ":", hostMode.name());
        }

        @Override // app.chalo.ads.UnifiedAdHostValidationError
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // app.chalo.ads.UnifiedAdHostValidationError
        /* JADX INFO: renamed from: b, reason: from getter */
        public final UnifiedAdSlot getF842a() {
            return this.f842a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnsupportedHostMode)) {
                return false;
            }
            UnsupportedHostMode unsupportedHostMode = (UnsupportedHostMode) obj;
            return this.f842a == unsupportedHostMode.f842a && this.b == unsupportedHostMode.b && this.c == unsupportedHostMode.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f842a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "UnsupportedHostMode(slot=" + this.f842a + ", hostMode=" + this.b + ", supportedHostMode=" + this.c + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    String getD();

    /* JADX INFO: renamed from: b */
    UnifiedAdSlot getF842a();
}
