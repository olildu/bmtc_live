package app.chalo.usecase;

import app.chalo.models.BookableSuperPassConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType;", "", "BookingWithoutProofRequirement", "ProofRequirementChanged", "PriceChanged", "CanDirectlyGoToPurchaseConfirmation", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$BookingWithoutProofRequirement;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$CanDirectlyGoToPurchaseConfirmation;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$PriceChanged;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$ProofRequirementChanged;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookableProductConfigForRenewSuccessType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$BookingWithoutProofRequirement;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookingWithoutProofRequirement extends BookableProductConfigForRenewSuccessType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f10149a;

        public BookingWithoutProofRequirement(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f10149a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookingWithoutProofRequirement) && Intrinsics.d(this.f10149a, ((BookingWithoutProofRequirement) obj).f10149a);
        }

        public final int hashCode() {
            return this.f10149a.hashCode();
        }

        public final String toString() {
            return "BookingWithoutProofRequirement(bookableSuperPassConfiguration=" + this.f10149a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$CanDirectlyGoToPurchaseConfirmation;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CanDirectlyGoToPurchaseConfirmation extends BookableProductConfigForRenewSuccessType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f10150a;

        public CanDirectlyGoToPurchaseConfirmation(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f10150a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CanDirectlyGoToPurchaseConfirmation) && Intrinsics.d(this.f10150a, ((CanDirectlyGoToPurchaseConfirmation) obj).f10150a);
        }

        public final int hashCode() {
            return this.f10150a.hashCode();
        }

        public final String toString() {
            return "CanDirectlyGoToPurchaseConfirmation(bookableSuperPassConfiguration=" + this.f10150a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$PriceChanged;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceChanged extends BookableProductConfigForRenewSuccessType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f10151a;

        public PriceChanged(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f10151a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PriceChanged) && Intrinsics.d(this.f10151a, ((PriceChanged) obj).f10151a);
        }

        public final int hashCode() {
            return this.f10151a.hashCode();
        }

        public final String toString() {
            return "PriceChanged(bookableSuperPassConfiguration=" + this.f10151a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType$ProofRequirementChanged;", "Lapp/chalo/usecase/BookableProductConfigForRenewSuccessType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProofRequirementChanged extends BookableProductConfigForRenewSuccessType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f10152a;

        public ProofRequirementChanged(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f10152a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProofRequirementChanged) && Intrinsics.d(this.f10152a, ((ProofRequirementChanged) obj).f10152a);
        }

        public final int hashCode() {
            return this.f10152a.hashCode();
        }

        public final String toString() {
            return "ProofRequirementChanged(bookableSuperPassConfiguration=" + this.f10152a + ")";
        }
    }
}
