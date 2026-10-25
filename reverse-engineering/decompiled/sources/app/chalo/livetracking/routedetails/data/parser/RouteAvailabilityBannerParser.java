package app.chalo.livetracking.routedetails.data.parser;

import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDialogInfo;
import app.chalo.network.config.ChaloJson;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/parser/RouteAvailabilityBannerParser;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteAvailabilityBannerParser {
    public static Boolean a(JsonObject jsonObject, String str) {
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement == null) {
            return null;
        }
        ChaloJson chaloJson = ChaloJson.f6455a;
        JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
        if (jsonPrimitiveA != null) {
            return JsonElementKt.d(jsonPrimitiveA);
        }
        return null;
    }

    public static String b(JsonObject jsonObject, String str) {
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement != null) {
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            if (jsonPrimitiveA != null) {
                InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f18192a;
                if (jsonPrimitiveA instanceof JsonNull) {
                    return null;
                }
                return jsonPrimitiveA.getC();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0047  */
    public static RouteAvailabilityBannerDetails c(JsonObject jsonObject) {
        RouteAvailabilityBannerDialogInfo routeAvailabilityBannerDialogInfo;
        String strB = b(jsonObject, "title");
        if (strB == null) {
            return null;
        }
        Boolean boolA = a(jsonObject, "isVisible");
        Boolean boolA2 = a(jsonObject, "isSticky");
        Boolean boolA3 = a(jsonObject, "isImageVisible");
        String strB2 = b(jsonObject, InMobiNetworkValues.CTA);
        Boolean boolA4 = a(jsonObject, "ctaVisibility");
        String strB3 = b(jsonObject, "imageUrl");
        String strB4 = b(jsonObject, "ctaAction");
        if (Intrinsics.d(a(jsonObject, "dialogVisibility"), Boolean.FALSE)) {
            routeAvailabilityBannerDialogInfo = null;
        } else {
            String strB5 = b(jsonObject, "dialogTitle");
            String strB6 = b(jsonObject, "dialogSubtitle");
            String strB7 = b(jsonObject, "dialogCtaTitle");
            String strB8 = b(jsonObject, "dialogCta");
            String strB9 = b(jsonObject, "dialogImage");
            if (strB5 == null && strB6 == null && strB7 == null && strB8 == null && strB9 == null) {
                routeAvailabilityBannerDialogInfo = null;
            } else {
                routeAvailabilityBannerDialogInfo = new RouteAvailabilityBannerDialogInfo(strB5, strB6, strB7, strB8, strB9);
            }
        }
        return new RouteAvailabilityBannerDetails(boolA, boolA2, boolA3, strB, strB2, boolA4, strB3, strB4, routeAvailabilityBannerDialogInfo);
    }
}
