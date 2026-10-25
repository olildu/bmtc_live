package app.chalo.productpurchase.productselection.domain;

import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult;", "", InitializationStatus.SUCCESS, "InvalidCity", "FetchFailed", "InvalidResponse", "UnknownError", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$FetchFailed;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$InvalidCity;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$InvalidResponse;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$Success;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$UnknownError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductFetchResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$FetchFailed;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchFailed extends ProductFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8660a;

        public FetchFailed(String str) {
            this.f8660a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchFailed) && Intrinsics.d(this.f8660a, ((FetchFailed) obj).f8660a);
        }

        public final int hashCode() {
            String str = this.f8660a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("FetchFailed(msg=", this.f8660a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$InvalidCity;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidCity extends ProductFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidCity f8661a = new InvalidCity();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidCity);
        }

        public final int hashCode() {
            return -393675281;
        }

        public final String toString() {
            return "InvalidCity";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$InvalidResponse;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidResponse extends ProductFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8662a;

        public InvalidResponse(String str) {
            this.f8662a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidResponse) && Intrinsics.d(this.f8662a, ((InvalidResponse) obj).f8662a);
        }

        public final int hashCode() {
            String str = this.f8662a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("InvalidResponse(msg=", this.f8662a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$Success;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends ProductFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AllProductConfigsResponseAppModel f8663a;

        public Success(AllProductConfigsResponseAppModel response) {
            Intrinsics.i(response, "response");
            this.f8663a = response;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f8663a, ((Success) obj).f8663a);
        }

        public final int hashCode() {
            return this.f8663a.hashCode();
        }

        public final String toString() {
            return "Success(response=" + this.f8663a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult$UnknownError;", "Lapp/chalo/productpurchase/productselection/domain/ProductFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownError extends ProductFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8664a;

        public UnknownError(String str) {
            this.f8664a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownError) && Intrinsics.d(this.f8664a, ((UnknownError) obj).f8664a);
        }

        public final int hashCode() {
            String str = this.f8664a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("UnknownError(msg=", this.f8664a, ")");
        }
    }
}
