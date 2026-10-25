package app.chalo.providers.cityprovider.impl.data.models.app;

import app.chalo.location.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CityAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8855a;

        static {
            int[] iArr = new int[ChaloTransitMode.values().length];
            try {
                iArr[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloTransitMode.TRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloTransitMode.METRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f8855a = iArr;
        }
    }

    public static final ArrayList a(ChaloTransitMode mode, CityAppModel cityAppModel) {
        Intrinsics.i(mode, "mode");
        List<ModeMapInfoAppModel> list = cityAppModel.h;
        ArrayList arrayList = new ArrayList();
        for (ModeMapInfoAppModel modeMapInfoAppModel : list) {
            ArrayList arrayList2 = modeMapInfoAppModel.f8858a == mode ? modeMapInfoAppModel.c : null;
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return CollectionsKt.I(arrayList);
    }

    public static final boolean b(CityAppModel cityAppModel, LatLng latLng) {
        Intrinsics.i(cityAppModel, "<this>");
        Intrinsics.i(latLng, "latLng");
        return ((LatLngBounds) cityAppModel.c.c.getValue()).contains(latLng.b());
    }

    public static final boolean c(ChaloTransitMode mode, CityAppModel cityAppModel) {
        Intrinsics.i(mode, "mode");
        List list = cityAppModel.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ModeMapInfoAppModel) obj).f8858a == mode) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ArrayList arrayList2 = ((ModeMapInfoAppModel) obj2).c;
                if (!arrayList2.isEmpty()) {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        if (((AgencyInfoAppModel) obj3).i) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
