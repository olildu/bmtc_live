package app.chalo.onboarding.citylocationselection;

import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.ko;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult;", "", InitializationStatus.SUCCESS, "Failure", "Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult$Failure;", "Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult$Success;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CityMetaDataCacheUpdateResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult$Failure;", "Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends CityMetaDataCacheUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6563a;
        public final Object b;

        public Failure(String str, String cityName, List list) {
            Intrinsics.i(cityName, "cityName");
            Map mapI = MapsKt.i(new Pair("cityListSize", Integer.valueOf(list != null ? list.size() : -1)), new Pair("cityName", cityName), new Pair("cityListContents", String.valueOf(list != null ? CollectionsKt.O(list, null, null, null, new ko(29), 31) : null)));
            this.f6563a = str;
            this.b = mapI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.d(this.f6563a, failure.f6563a) && Intrinsics.d(this.b, failure.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6563a.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(errorMsg=" + this.f6563a + ", additionalInfoForAnalytics=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult$Success;", "Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends CityMetaDataCacheUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CityAppModel f6564a;

        public Success(CityAppModel cityModel) {
            Intrinsics.i(cityModel, "cityModel");
            this.f6564a = cityModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f6564a, ((Success) obj).f6564a);
        }

        public final int hashCode() {
            return this.f6564a.hashCode();
        }

        public final String toString() {
            return "Success(cityModel=" + this.f6564a + ")";
        }
    }
}
