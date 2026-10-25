package app.chalo.sos.feature;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/sos/feature/SosPickContactResult;", "", InitializationStatus.SUCCESS, "Error", "Cancelled", "Lapp/chalo/sos/feature/SosPickContactResult$Cancelled;", "Lapp/chalo/sos/feature/SosPickContactResult$Error;", "Lapp/chalo/sos/feature/SosPickContactResult$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SosPickContactResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/feature/SosPickContactResult$Cancelled;", "Lapp/chalo/sos/feature/SosPickContactResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cancelled extends SosPickContactResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancelled f9441a = new Cancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancelled);
        }

        public final int hashCode() {
            return 1967166483;
        }

        public final String toString() {
            return "Cancelled";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/feature/SosPickContactResult$Error;", "Lapp/chalo/sos/feature/SosPickContactResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends SosPickContactResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9442a;

        public Error(String str) {
            this.f9442a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f9442a, ((Error) obj).f9442a);
        }

        public final int hashCode() {
            String str = this.f9442a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Error(desc=", this.f9442a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/feature/SosPickContactResult$Success;", "Lapp/chalo/sos/feature/SosPickContactResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends SosPickContactResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SosContact f9443a;

        public Success(SosContact sosContact) {
            this.f9443a = sosContact;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f9443a, ((Success) obj).f9443a);
        }

        public final int hashCode() {
            return this.f9443a.hashCode();
        }

        public final String toString() {
            return "Success(contact=" + this.f9443a + ")";
        }
    }
}
