package app.chalo.home.domain;

import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.GridWidgetDataKt;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.utils.CommonHtmlParser;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetRegularBusPageItemsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRegularBusPageItemsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeScreenAnalyticsHelper f3051a;
    public final CommonHtmlParser b;

    public GetRegularBusPageItemsUseCase(HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, CommonHtmlParser commonHtmlParser) {
        this.f3051a = homeScreenAnalyticsHelper;
        this.b = commonHtmlParser;
    }

    public static ChaloTextWithBackgroundData a(ChaloTextDataAppModel chaloTextDataAppModel) {
        if (chaloTextDataAppModel == null) {
            return new ChaloTextWithBackgroundData();
        }
        return GridWidgetDataKt.c(chaloTextDataAppModel, chaloTextDataAppModel.d, chaloTextDataAppModel.b, chaloTextDataAppModel.f2335a.b.getShape());
    }
}
