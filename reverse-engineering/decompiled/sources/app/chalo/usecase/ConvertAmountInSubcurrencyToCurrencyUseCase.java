package app.chalo.usecase;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloRoundingMode;
import app.chalo.utils.KBigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ConvertAmountInSubcurrencyToCurrencyUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertAmountInSubcurrencyToCurrencyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f10160a;
    public final GetRoundedOffAmountInSubcurrencyUseCase b;

    public ConvertAmountInSubcurrencyToCurrencyUseCase(CityProvider cityProvider, GetRoundedOffAmountInSubcurrencyUseCase getRoundedOffAmountInSubcurrencyUseCase) {
        this.f10160a = cityProvider;
        this.b = getRoundedOffAmountInSubcurrencyUseCase;
    }

    public final double a(long j, CurrencyRoundOffLogic roundOffLogic) {
        Intrinsics.i(roundOffLogic, "roundOffLogic");
        CityAppModel cityAppModel = (CityAppModel) this.f10160a.b().getValue();
        long j2 = cityAppModel != null ? cityAppModel.r.c : 100L;
        long jA = this.b.a(j, roundOffLogic);
        if (jA % j2 == 0) {
            return jA / j2;
        }
        KBigDecimal kBigDecimal = new KBigDecimal(String.valueOf(jA));
        ChaloRoundingMode chaloRoundingMode = ChaloRoundingMode.HALF_UP;
        return KBigDecimal.b(kBigDecimal.c(2, chaloRoundingMode), new KBigDecimal(String.valueOf(j2)), chaloRoundingMode).f10430a.doubleValue();
    }
}
