package app.chalo.utils;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.instantticket.data.model.api.response.InstantTicketResponseApiModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.GetOndcMetroTicketAppModelFromApiUseCase;
import app.chalo.ondc.model.api.OndcMetroTicketApiModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/BaseMobileTicketConverters;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseMobileTicketConverters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f10415a;

    public BaseMobileTicketConverters(CrashlyticsLogger crashlyticsLogger, GetOndcMetroTicketAppModelFromApiUseCase getOndcMetroTicketAppModelFromApiUseCase) {
        this.f10415a = crashlyticsLogger;
    }

    public final InstantTicketResponseApiModel a(JsonObject mobileTicket) {
        Intrinsics.i(mobileTicket, "mobileTicket");
        try {
            if ("mobileTicket".equalsIgnoreCase(JsonElementExtensionsKt.j(mobileTicket, "productType")) && "instantTicket".equalsIgnoreCase(JsonElementExtensionsKt.j(mobileTicket, "productSubType"))) {
                ChaloJson chaloJson = ChaloJson.f6455a;
                Json json = ChaloJson.b;
                String string = mobileTicket.toString();
                json.getClass();
                return (InstantTicketResponseApiModel) json.b(string, InstantTicketResponseApiModel.INSTANCE.serializer());
            }
            return null;
        } catch (Exception e) {
            this.f10415a.i(e);
            return null;
        }
    }

    public final OndcMetroTicketAppModel b(JsonObject jsonObject) {
        try {
            if ("mobileTicket".equalsIgnoreCase(JsonElementExtensionsKt.j(jsonObject, "productType")) && "ondcMetroTicket".equalsIgnoreCase(JsonElementExtensionsKt.j(jsonObject, "productSubType"))) {
                Json json = ChaloJson.b;
                String string = jsonObject.toString();
                json.getClass();
                return GetOndcMetroTicketAppModelFromApiUseCase.a((OndcMetroTicketApiModel) json.b(string, OndcMetroTicketApiModel.INSTANCE.serializer()));
            }
            return null;
        } catch (Exception e) {
            this.f10415a.i(e);
            return null;
        }
    }
}
