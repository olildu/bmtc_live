package app.chalo.usercommutepreference.data.mappers;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.network.config.ChaloJson;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideEntity;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModelKt;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceResultType;
import defpackage.vo1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceEntityAppModelMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10241a;

        static {
            int[] iArr = new int[UserCommutePreferenceStopPlaceResultType.values().length];
            try {
                iArr[UserCommutePreferenceStopPlaceResultType.PLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserCommutePreferenceStopPlaceResultType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10241a = iArr;
        }
    }

    public static final UserCommutePreferenceSavedRideAppModel a(UserCommutePreferenceSavedRideEntity userCommutePreferenceSavedRideEntity) {
        Intrinsics.i(userCommutePreferenceSavedRideEntity, "<this>");
        String str = userCommutePreferenceSavedRideEntity.f10238a;
        String str2 = userCommutePreferenceSavedRideEntity.e;
        String str3 = userCommutePreferenceSavedRideEntity.c;
        return new UserCommutePreferenceSavedRideAppModel(str, b(str2, str3), b(userCommutePreferenceSavedRideEntity.f, str3), userCommutePreferenceSavedRideEntity.d);
    }

    public static final UserCommutePreferencePlaceLocationAppModel b(String str, String str2) throws JsonException {
        JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str));
        String strJ = JsonElementExtensionsKt.j(jsonObjectG, "type");
        String strJ2 = JsonElementExtensionsKt.j(jsonObjectG, "id");
        String strJ3 = JsonElementExtensionsKt.j(jsonObjectG, "stopPlaceName");
        String strS = JsonElementExtensionsKt.s(jsonObjectG, "stopAddress", "");
        double dB = JsonElementExtensionsKt.b(jsonObjectG, "latitude");
        double dB2 = JsonElementExtensionsKt.b(jsonObjectG, "longitude");
        String strJ4 = JsonElementExtensionsKt.j(jsonObjectG, "searchPartner");
        UserCommutePreferenceStopPlaceResultType.INSTANCE.getClass();
        UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultTypeA = UserCommutePreferenceStopPlaceResultType.Companion.a(strJ);
        if (userCommutePreferenceStopPlaceResultTypeA == null) {
            throw new NullPointerException(vo1.m("Invalid location type: ", strJ));
        }
        int i = WhenMappings.f10241a[userCommutePreferenceStopPlaceResultTypeA.ordinal()];
        if (i == 1) {
            return new UserCommutePreferencePlaceLocationAppModel.Place(strJ2, str2, strJ3, dB, dB2, strJ4, UserCommutePreferenceStopPlaceResultType.PLACE);
        }
        if (i == 2) {
            return new UserCommutePreferencePlaceLocationAppModel.Stop(strJ2, str2, strJ3, strS, dB, dB2, strJ4, UserCommutePreferenceStopPlaceResultType.STOP);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel) {
        String str;
        String strA = UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel);
        if (userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Place) {
            str = null;
        } else {
            if (!(userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Stop)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).e;
        }
        Json json = ChaloJson.b;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.a(jsonObjectBuilder, "type", userCommutePreferencePlaceLocationAppModel.getI().name());
        JsonElementBuildersKt.a(jsonObjectBuilder, "id", userCommutePreferencePlaceLocationAppModel.getB());
        JsonElementBuildersKt.a(jsonObjectBuilder, "stopPlaceName", strA);
        JsonElementBuildersKt.a(jsonObjectBuilder, "stopAddress", str);
        JsonPrimitive element = JsonElementKt.a(Double.valueOf(userCommutePreferencePlaceLocationAppModel.getF()));
        Intrinsics.i(element, "element");
        LinkedHashMap linkedHashMap = jsonObjectBuilder.f18199a;
        JsonPrimitive element2 = JsonElementKt.a(Double.valueOf(userCommutePreferencePlaceLocationAppModel.getG()));
        Intrinsics.i(element2, "element");
        JsonElementBuildersKt.a(jsonObjectBuilder, "searchPartner", userCommutePreferencePlaceLocationAppModel.getH());
        JsonObject jsonObject = new JsonObject(linkedHashMap);
        json.getClass();
        return json.a(JsonObject.INSTANCE.serializer(), jsonObject);
    }
}
