package app.chalo.contract;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/contract/FetchCityMetaDataErrorType;", "", "CityNotServiceable", "CityIdNotAvailable", "CityMetaDataFetchError", "Lapp/chalo/contract/FetchCityMetaDataErrorType$CityIdNotAvailable;", "Lapp/chalo/contract/FetchCityMetaDataErrorType$CityMetaDataFetchError;", "Lapp/chalo/contract/FetchCityMetaDataErrorType$CityNotServiceable;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FetchCityMetaDataErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/FetchCityMetaDataErrorType$CityIdNotAvailable;", "Lapp/chalo/contract/FetchCityMetaDataErrorType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CityIdNotAvailable extends FetchCityMetaDataErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CityIdNotAvailable f1943a = new CityIdNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/FetchCityMetaDataErrorType$CityMetaDataFetchError;", "Lapp/chalo/contract/FetchCityMetaDataErrorType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityMetaDataFetchError extends FetchCityMetaDataErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1944a;

        public CityMetaDataFetchError(String str) {
            this.f1944a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CityMetaDataFetchError) && Intrinsics.d(this.f1944a, ((CityMetaDataFetchError) obj).f1944a);
        }

        public final int hashCode() {
            return this.f1944a.hashCode();
        }

        public final String toString() {
            return vo1.B("CityMetaDataFetchError(msg=", this.f1944a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/FetchCityMetaDataErrorType$CityNotServiceable;", "Lapp/chalo/contract/FetchCityMetaDataErrorType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CityNotServiceable extends FetchCityMetaDataErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CityNotServiceable f1945a = new CityNotServiceable();
    }
}
