package app.chalo.ble_communication.base;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ble_communication/base/BLEOperationResult;", "SUCCESS", "FAILURE", "", InitializationStatus.SUCCESS, "Failure", "Lapp/chalo/ble_communication/base/BLEOperationResult$Failure;", "Lapp/chalo/ble_communication/base/BLEOperationResult$Success;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BLEOperationResult<SUCCESS, FAILURE> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ble_communication/base/BLEOperationResult$Failure;", "SUCCESS", "FAILURE", "Lapp/chalo/ble_communication/base/BLEOperationResult;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure<SUCCESS, FAILURE> extends BLEOperationResult<SUCCESS, FAILURE> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f1109a;

        public Failure(Object obj) {
            this.f1109a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.d(this.f1109a, ((Failure) obj).f1109a);
        }

        public final int hashCode() {
            Object obj = this.f1109a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return n21.f(this.f1109a, "Failure(data=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ble_communication/base/BLEOperationResult$Success;", "SUCCESS", "FAILURE", "Lapp/chalo/ble_communication/base/BLEOperationResult;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<SUCCESS, FAILURE> extends BLEOperationResult<SUCCESS, FAILURE> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Object obj2 = Unit.f17538a;
            return obj2.equals(obj2);
        }

        public final int hashCode() {
            return Unit.f17538a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + Unit.f17538a + ")";
        }
    }
}
