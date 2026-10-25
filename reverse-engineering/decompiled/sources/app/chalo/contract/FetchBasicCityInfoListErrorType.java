package app.chalo.contract;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/contract/FetchBasicCityInfoListErrorType;", "", "FetchBasicCityInfoListError", "Lapp/chalo/contract/FetchBasicCityInfoListErrorType$FetchBasicCityInfoListError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FetchBasicCityInfoListErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/FetchBasicCityInfoListErrorType$FetchBasicCityInfoListError;", "Lapp/chalo/contract/FetchBasicCityInfoListErrorType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchBasicCityInfoListError extends FetchBasicCityInfoListErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1942a;

        public FetchBasicCityInfoListError(String msg) {
            Intrinsics.i(msg, "msg");
            this.f1942a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchBasicCityInfoListError) && Intrinsics.d(this.f1942a, ((FetchBasicCityInfoListError) obj).f1942a);
        }

        public final int hashCode() {
            return this.f1942a.hashCode();
        }

        public final String toString() {
            return vo1.B("FetchBasicCityInfoListError(msg=", this.f1942a, ")");
        }
    }
}
