package app.chalo.onboarding.converters;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.location.LatLng;
import app.chalo.models.BasicCityInfoAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/converters/CityResponseConverter;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityResponseConverter {
    public static ArrayList a(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        List list = jsonArray.f18186a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BasicCityInfoAppModel basicCityInfoAppModel = null;
                try {
                    JsonObject jsonObjectG = JsonElementKt.g((JsonElement) it.next());
                    boolean zM = JsonElementExtensionsKt.m(jsonObjectG, "beta_mode", false);
                    boolean zM2 = JsonElementExtensionsKt.m(jsonObjectG, "isComingSoon", false);
                    JsonElement jsonElement = (JsonElement) jsonObjectG.get("polyBound");
                    basicCityInfoAppModel = new BasicCityInfoAppModel(JsonElementExtensionsKt.j(jsonObjectG, "cityId"), JsonElementExtensionsKt.j(jsonObjectG, "cityDisplayName"), zM, zM2, JsonElementExtensionsKt.m(jsonObjectG, "isDisabled", false), b(jsonElement != null ? JsonElementKt.f(jsonElement) : null));
                } catch (Exception unused) {
                }
                if (basicCityInfoAppModel != null) {
                    arrayList.add(basicCityInfoAppModel);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList b(JsonArray jsonArray) {
        JsonArray jsonArrayF;
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            List list = jsonArray.f18186a;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        jsonArrayF = JsonElementKt.f(jsonArray.get(i));
                    } catch (Exception unused) {
                        jsonArrayF = null;
                    }
                    if (jsonArrayF != null && jsonArrayF.f18186a.size() == 2) {
                        try {
                            arrayList.add(new LatLng(Double.parseDouble(JsonElementKt.h(jsonArrayF.get(0)).getC()), Double.parseDouble(JsonElementKt.h(jsonArrayF.get(1)).getC())));
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
