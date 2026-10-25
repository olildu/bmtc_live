package app.chalo.livetracking.universalsearch.domain;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/IsCityRouteNamesDisabledUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsCityRouteNamesDisabledUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f5035a;
    public final ChaloConfigFeature b;

    public IsCityRouteNamesDisabledUseCase(ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f5035a = cityProvider;
        this.b = chaloConfigFeature;
    }

    public final boolean a() {
        String str;
        CityAppModel cityAppModel = (CityAppModel) this.f5035a.b().getValue();
        if (cityAppModel != null && (str = cityAppModel.f8854a) != null) {
            String str2 = (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new IsCityRouteNamesDisabledUseCase$invoke$cityNameList$1(this, null));
            if (str2.length() != 0) {
                try {
                    JsonArray jsonArrayF = JsonElementKt.f(ChaloJson.b.f(str2));
                    int size = jsonArrayF.f18186a.size();
                    for (int i = 0; i < size; i++) {
                        if (StringsKt.x(JsonElementExtensionsKt.i(jsonArrayF, i), str, true)) {
                            return true;
                        }
                    }
                } catch (Exception e) {
                    Reflection.a(IsCityRouteNamesDisabledUseCase.class).f();
                    String.valueOf(e);
                }
            }
        }
        return false;
    }
}
