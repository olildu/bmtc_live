package app.chalo.premiumbus.ui.faredetails.contract;

import defpackage.r1;
import defpackage.vo1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType;", "", "TncSection", "FareNoteSection", "FareValidationFailed", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType$FareNoteSection;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType$FareValidationFailed;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType$TncSection;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusFareDetailsBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType$FareNoteSection;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareNoteSection extends PremiumBusFareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7566a;

        public FareNoteSection(String fareNote) {
            Intrinsics.i(fareNote, "fareNote");
            this.f7566a = fareNote;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FareNoteSection) && Intrinsics.d(this.f7566a, ((FareNoteSection) obj).f7566a);
        }

        public final int hashCode() {
            return this.f7566a.hashCode();
        }

        public final String toString() {
            return vo1.B("FareNoteSection(fareNote=", this.f7566a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType$FareValidationFailed;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareValidationFailed extends PremiumBusFareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7567a;
        public final int b;

        public FareValidationFailed(String message, int i) {
            Intrinsics.i(message, "message");
            this.f7567a = message;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FareValidationFailed)) {
                return false;
            }
            FareValidationFailed fareValidationFailed = (FareValidationFailed) obj;
            return Intrinsics.d(this.f7567a, fareValidationFailed.f7567a) && this.b == fareValidationFailed.b;
        }

        public final int hashCode() {
            return (this.f7567a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "FareValidationFailed(message=", this.f7567a, ", finalFare=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType$TncSection;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncSection extends PremiumBusFareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7568a;

        public TncSection(List list) {
            this.f7568a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TncSection) && Intrinsics.d(this.f7568a, ((TncSection) obj).f7568a);
        }

        public final int hashCode() {
            return this.f7568a.hashCode();
        }

        public final String toString() {
            return r1.d("TncSection(tncList=", ")", this.f7568a);
        }
    }
}
