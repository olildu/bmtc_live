package app.chalo.ondc.domain;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.ondc.model.api.OndcTicketConfiguration;
import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FetchOndcConfigUseCaseKt {
    public static final OndcTicketConfiguration a(ProductConfigForUiAppModel productConfigForUiAppModel) {
        String str = productConfigForUiAppModel.f8217a;
        String str2 = productConfigForUiAppModel.b;
        String str3 = productConfigForUiAppModel.d;
        String str4 = productConfigForUiAppModel.h;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        boolean z = productConfigForUiAppModel.i;
        boolean z2 = productConfigForUiAppModel.j;
        String str6 = productConfigForUiAppModel.l;
        String str7 = productConfigForUiAppModel.m;
        BrandingDetails brandingDetails = productConfigForUiAppModel.o;
        return new OndcTicketConfiguration(str, str3, str2, str5, z, Boolean.valueOf(z2), productConfigForUiAppModel.k, -1, brandingDetails, str6, str7);
    }
}
