package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/juspay/JuspayOperationResult;", "", "Onboarding", "Management", "UpiUiScanPay", "Error", "Lapp/chalo/juspay/JuspayOperationResult$Error;", "Lapp/chalo/juspay/JuspayOperationResult$Management;", "Lapp/chalo/juspay/JuspayOperationResult$Onboarding;", "Lapp/chalo/juspay/JuspayOperationResult$UpiUiScanPay;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JuspayOperationResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationResult$Error;", "Lapp/chalo/juspay/JuspayOperationResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements JuspayOperationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPayErrorResultAppModel f4056a;

        public Error(JusPayErrorResultAppModel jusPayErrorResultAppModel) {
            this.f4056a = jusPayErrorResultAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f4056a, ((Error) obj).f4056a);
        }

        public final int hashCode() {
            return this.f4056a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f4056a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationResult$Management;", "Lapp/chalo/juspay/JuspayOperationResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Management implements JuspayOperationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPayResultDataType.Management f4057a;

        public Management(JusPayResultDataType.Management data) {
            Intrinsics.i(data, "data");
            this.f4057a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Management) && Intrinsics.d(this.f4057a, ((Management) obj).f4057a);
        }

        public final int hashCode() {
            return this.f4057a.b.hashCode();
        }

        public final String toString() {
            return "Management(data=" + this.f4057a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationResult$Onboarding;", "Lapp/chalo/juspay/JuspayOperationResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Onboarding implements JuspayOperationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPayResultDataType.OnBoardingAndPay f4058a;

        public Onboarding(JusPayResultDataType.OnBoardingAndPay data) {
            Intrinsics.i(data, "data");
            this.f4058a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Onboarding) && Intrinsics.d(this.f4058a, ((Onboarding) obj).f4058a);
        }

        public final int hashCode() {
            return this.f4058a.hashCode();
        }

        public final String toString() {
            return "Onboarding(data=" + this.f4058a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationResult$UpiUiScanPay;", "Lapp/chalo/juspay/JuspayOperationResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpiUiScanPay implements JuspayOperationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPayResultDataType.UpiUiScanPay f4059a;

        public UpiUiScanPay(JusPayResultDataType.UpiUiScanPay data) {
            Intrinsics.i(data, "data");
            this.f4059a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpiUiScanPay) && Intrinsics.d(this.f4059a, ((UpiUiScanPay) obj).f4059a);
        }

        public final int hashCode() {
            return this.f4059a.hashCode();
        }

        public final String toString() {
            return "UpiUiScanPay(data=" + this.f4059a + ")";
        }
    }
}
