package app.chalo.multimodalticket.ui;

import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType;", "", "None", "PassengerSelectionType", "ErrorType", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType$ErrorType;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType$None;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType$PassengerSelectionType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupTicketLegSelectionBottomSheetDataStateType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType$ErrorType;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorType extends GroupTicketLegSelectionBottomSheetDataStateType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5927a;

        public ErrorType(String str) {
            this.f5927a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorType) && Intrinsics.d(this.f5927a, ((ErrorType) obj).f5927a);
        }

        public final int hashCode() {
            String str = this.f5927a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ErrorType(errorMsg=", this.f5927a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType$None;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends GroupTicketLegSelectionBottomSheetDataStateType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f5928a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 504552568;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType$PassengerSelectionType;", "Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionBottomSheetDataStateType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerSelectionType extends GroupTicketLegSelectionBottomSheetDataStateType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5929a;

        public PassengerSelectionType(List selectedStepList) {
            Intrinsics.i(selectedStepList, "selectedStepList");
            this.f5929a = selectedStepList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassengerSelectionType) && Intrinsics.d(this.f5929a, ((PassengerSelectionType) obj).f5929a);
        }

        public final int hashCode() {
            return this.f5929a.hashCode();
        }

        public final String toString() {
            return r1.d("PassengerSelectionType(selectedStepList=", ")", this.f5929a);
        }
    }
}
