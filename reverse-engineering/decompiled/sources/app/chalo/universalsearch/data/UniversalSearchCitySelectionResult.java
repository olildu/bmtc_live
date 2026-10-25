package app.chalo.universalsearch.data;

import app.chalo.location.LatLng;
import defpackage.dd;
import defpackage.ll1;
import defpackage.nf1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult;", "", "Companion", "CitySelected", "CityNotServiceable", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CityNotServiceable;", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CitySelected;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class UniversalSearchCitySelectionResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10132a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(23));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UniversalSearchCitySelectionResult> serializer() {
            return (KSerializer) UniversalSearchCitySelectionResult.f10132a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CityNotServiceable;", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CityNotServiceable extends UniversalSearchCitySelectionResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final LatLng b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CityNotServiceable$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CityNotServiceable;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CityNotServiceable> serializer() {
                return UniversalSearchCitySelectionResult$CityNotServiceable$$serializer.f10133a;
            }
        }

        public /* synthetic */ CityNotServiceable(int i, LatLng latLng) {
            if (1 == (i & 1)) {
                this.b = latLng;
            } else {
                PluginExceptionsKt.b(UniversalSearchCitySelectionResult$CityNotServiceable$$serializer.f10133a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CityNotServiceable) && Intrinsics.d(this.b, ((CityNotServiceable) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CityNotServiceable(latLng=" + this.b + ")";
        }

        public CityNotServiceable(LatLng latLng) {
            Intrinsics.i(latLng, "latLng");
            this.b = latLng;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CitySelected;", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CitySelected extends UniversalSearchCitySelectionResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;
        public final LatLng e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CitySelected$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchCitySelectionResult$CitySelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CitySelected> serializer() {
                return UniversalSearchCitySelectionResult$CitySelected$$serializer.f10134a;
            }
        }

        public /* synthetic */ CitySelected(int i, String str, String str2, String str3, LatLng latLng) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(UniversalSearchCitySelectionResult$CitySelected$$serializer.f10134a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = latLng;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CitySelected)) {
                return false;
            }
            CitySelected citySelected = (CitySelected) obj;
            return Intrinsics.d(this.b, citySelected.b) && Intrinsics.d(this.c, citySelected.c) && Intrinsics.d(this.d, citySelected.d) && Intrinsics.d(this.e, citySelected.e);
        }

        public final int hashCode() {
            String str = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("CitySelected(cityDescription=", this.b, ", cityId=", this.c, ", cityDisplayName=");
            sbE.append(this.d);
            sbE.append(", latLng=");
            sbE.append(this.e);
            sbE.append(")");
            return sbE.toString();
        }

        public CitySelected(String str, String cityId, String cityDisplayName, LatLng latLng) {
            Intrinsics.i(cityId, "cityId");
            Intrinsics.i(cityDisplayName, "cityDisplayName");
            Intrinsics.i(latLng, "latLng");
            this.b = str;
            this.c = cityId;
            this.d = cityDisplayName;
            this.e = latLng;
        }
    }
}
