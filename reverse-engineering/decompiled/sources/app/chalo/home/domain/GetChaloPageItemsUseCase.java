package app.chalo.home.domain;

import app.chalo.data.BackgroundAppModel;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.PaddingAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetChaloPageItemsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloPageItemsUseCase {
    public static ChaloTextWithBackgroundData a(ChaloTextDataAppModel chaloTextDataAppModel) {
        if (chaloTextDataAppModel == null) {
            return new ChaloTextWithBackgroundData();
        }
        BackgroundAppModel backgroundAppModel = chaloTextDataAppModel.f2335a;
        String str = backgroundAppModel.f2311a;
        PaddingAppModel paddingAppModel = backgroundAppModel.c;
        IconType iconType = chaloTextDataAppModel.b;
        IconType iconType2 = chaloTextDataAppModel.d;
        return new ChaloTextWithBackgroundData(str, backgroundAppModel.b.getShape(), paddingAppModel, iconType, chaloTextDataAppModel.c, iconType2, chaloTextDataAppModel.e, chaloTextDataAppModel.f);
    }
}
