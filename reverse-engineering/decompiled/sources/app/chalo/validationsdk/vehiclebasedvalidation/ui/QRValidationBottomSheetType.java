package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRValidationBottomSheetType;", "", "ValidationFailed", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRValidationBottomSheetType$ValidationFailed;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QRValidationBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRValidationBottomSheetType$ValidationFailed;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRValidationBottomSheetType;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationFailed extends QRValidationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10731a;

        public ValidationFailed(String str) {
            this.f10731a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidationFailed) && Intrinsics.d(this.f10731a, ((ValidationFailed) obj).f10731a);
        }

        public final int hashCode() {
            String str = this.f10731a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ValidationFailed(message=", this.f10731a, ")");
        }
    }
}
