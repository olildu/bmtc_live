package app.chalo.kyc.min.ui.minkycdetails;

import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;", "", "InitializationIntent", "FocusChanged", "FullNameEnteredIntent", "ProceedButtonClickedIntent", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$FocusChanged;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$FullNameEnteredIntent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$InitializationIntent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$ProceedButtonClickedIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinKycDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$FocusChanged;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FocusChanged extends MinKycDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4120a;

        public FocusChanged(boolean z) {
            this.f4120a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FocusChanged) && this.f4120a == ((FocusChanged) obj).f4120a;
        }

        public final int hashCode() {
            return this.f4120a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("FocusChanged(isFieldFocused=", ")", this.f4120a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$FullNameEnteredIntent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FullNameEnteredIntent extends MinKycDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4121a;

        public FullNameEnteredIntent(String fullName) {
            Intrinsics.i(fullName, "fullName");
            this.f4121a = fullName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FullNameEnteredIntent) && Intrinsics.d(this.f4121a, ((FullNameEnteredIntent) obj).f4121a);
        }

        public final int hashCode() {
            return this.f4121a.hashCode();
        }

        public final String toString() {
            return vo1.B("FullNameEnteredIntent(fullName=", this.f4121a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$InitializationIntent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitializationIntent extends MinKycDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f4122a = new InitializationIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent$ProceedButtonClickedIntent;", "Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedButtonClickedIntent extends MinKycDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4123a;

        public ProceedButtonClickedIntent(String fullName) {
            Intrinsics.i(fullName, "fullName");
            this.f4123a = fullName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedButtonClickedIntent) && Intrinsics.d(this.f4123a, ((ProceedButtonClickedIntent) obj).f4123a);
        }

        public final int hashCode() {
            return this.f4123a.hashCode();
        }

        public final String toString() {
            return vo1.B("ProceedButtonClickedIntent(fullName=", this.f4123a, ")");
        }
    }
}
