package app.chalo.electricitybill.ui.paymenthistory;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState;", "", "HistoryAvailable", "NoHistoryData", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState$HistoryAvailable;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState$NoHistoryData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ElectricityPaymentHistoryScreenUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState$HistoryAvailable;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HistoryAvailable extends ElectricityPaymentHistoryScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EBillHistoryScreenUISpecs f2602a;
        public final List b;

        public HistoryAvailable(List billItems) {
            EBillHistoryScreenUISpecs eBillHistoryScreenUISpecs = new EBillHistoryScreenUISpecs();
            Intrinsics.i(billItems, "billItems");
            this.f2602a = eBillHistoryScreenUISpecs;
            this.b = billItems;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryAvailable)) {
                return false;
            }
            HistoryAvailable historyAvailable = (HistoryAvailable) obj;
            return Intrinsics.d(this.f2602a, historyAvailable.f2602a) && Intrinsics.d(this.b, historyAvailable.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2602a.hashCode() * 31);
        }

        public final String toString() {
            return "HistoryAvailable(specs=" + this.f2602a + ", billItems=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState$NoHistoryData;", "Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryScreenUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoHistoryData extends ElectricityPaymentHistoryScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoHistoryDataUISpecs f2603a = new NoHistoryDataUISpecs();
        public final ImageUIState b;
        public final TextUIState.ChaloTextUIState c;

        public NoHistoryData(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
            this.b = imageUIState;
            this.c = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoHistoryData)) {
                return false;
            }
            NoHistoryData noHistoryData = (NoHistoryData) obj;
            return Intrinsics.d(this.f2603a, noHistoryData.f2603a) && Intrinsics.d(this.b, noHistoryData.b) && Intrinsics.d(this.c, noHistoryData.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + r30.e(this.b, this.f2603a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoHistoryData(specs=");
            sb.append(this.f2603a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", message=");
            return py.f(sb, this.c, ")");
        }
    }
}
