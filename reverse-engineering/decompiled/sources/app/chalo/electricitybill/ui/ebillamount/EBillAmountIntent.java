package app.chalo.electricitybill.ui.ebillamount;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent;", "", "StartingIntent", "AmountEnteredIntent", "NextBtnClickIntent", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent$AmountEnteredIntent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent$NextBtnClickIntent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent$StartingIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EBillAmountIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent$AmountEnteredIntent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AmountEnteredIntent extends EBillAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2549a;

        public AmountEnteredIntent(String enteredAmountString) {
            Intrinsics.i(enteredAmountString, "enteredAmountString");
            this.f2549a = enteredAmountString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountEnteredIntent) && Intrinsics.d(this.f2549a, ((AmountEnteredIntent) obj).f2549a);
        }

        public final int hashCode() {
            return this.f2549a.hashCode();
        }

        public final String toString() {
            return vo1.B("AmountEnteredIntent(enteredAmountString=", this.f2549a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent$NextBtnClickIntent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NextBtnClickIntent extends EBillAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextBtnClickIntent f2550a = new NextBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent$StartingIntent;", "Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartingIntent extends EBillAmountIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2551a;

        public StartingIntent(String electricityBillAppModel) {
            Intrinsics.i(electricityBillAppModel, "electricityBillAppModel");
            this.f2551a = electricityBillAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartingIntent) && Intrinsics.d(this.f2551a, ((StartingIntent) obj).f2551a);
        }

        public final int hashCode() {
            return this.f2551a.hashCode();
        }

        public final String toString() {
            return vo1.B("StartingIntent(electricityBillAppModel=", this.f2551a, ")");
        }
    }
}
