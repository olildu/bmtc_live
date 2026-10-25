package app.chalo.features.wallet;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.usecase.ConvertAmountInSubcurrencyToCurrencyUseCase;
import app.chalo.usecase.GetCurrencyStringFromAmountInSubcurrencyUseCase;
import app.chalo.utils.ChaloRoundingMode;
import app.chalo.utils.FareUtils;
import app.chalo.utils.KBigDecimal;
import defpackage.vo1;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/wallet/CurrencyFeatureImpl;", "Lapp/chalo/features/wallet/CurrencyFeature;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurrencyFeatureImpl implements CurrencyFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConvertAmountInSubcurrencyToCurrencyUseCase f2767a;
    public final GetCurrencyStringFromAmountInSubcurrencyUseCase b;
    public final CityProvider c;

    public CurrencyFeatureImpl(ConvertAmountInSubcurrencyToCurrencyUseCase convertAmountInSubcurrencyToCurrencyUseCase, GetCurrencyStringFromAmountInSubcurrencyUseCase getCurrencyStringFromAmountInSubcurrencyUseCase, CityProvider cityProvider) {
        this.f2767a = convertAmountInSubcurrencyToCurrencyUseCase;
        this.b = getCurrencyStringFromAmountInSubcurrencyUseCase;
        this.c = cityProvider;
    }

    @Override // app.chalo.features.wallet.CurrencyFeature
    public final String a(long j, CurrencyRoundOffLogic roundOffLogic) {
        String str;
        Intrinsics.i(roundOffLogic, "roundOffLogic");
        GetCurrencyStringFromAmountInSubcurrencyUseCase getCurrencyStringFromAmountInSubcurrencyUseCase = this.b;
        CityProvider cityProvider = getCurrencyStringFromAmountInSubcurrencyUseCase.f10179a;
        CityAppModel cityAppModel = (CityAppModel) cityProvider.getE().getValue();
        long j2 = cityAppModel != null ? cityAppModel.r.c : 100L;
        CityAppModel cityAppModel2 = (CityAppModel) cityProvider.getE().getValue();
        if (cityAppModel2 == null || (str = cityAppModel2.r.b) == null) {
            str = "₹";
        }
        long jA = getCurrencyStringFromAmountInSubcurrencyUseCase.b.a(j, roundOffLogic);
        if (jA % j2 == 0) {
            if (str.equals("₹")) {
                return vo1.A(str, FareUtils.a(String.valueOf(jA / j2)));
            }
            return str + (jA / j2);
        }
        KBigDecimal kBigDecimal = new KBigDecimal(String.valueOf(j2));
        KBigDecimal kBigDecimal2 = new KBigDecimal(String.valueOf(j));
        ChaloRoundingMode chaloRoundingMode = ChaloRoundingMode.HALF_UP;
        KBigDecimal kBigDecimalC = kBigDecimal2.c(2, chaloRoundingMode);
        if (str.equals("₹")) {
            return vo1.A(str, FareUtils.a(KBigDecimal.b(kBigDecimalC, kBigDecimal, chaloRoundingMode).toString()));
        }
        return str + KBigDecimal.b(kBigDecimalC, kBigDecimal, chaloRoundingMode);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // app.chalo.features.wallet.CurrencyFeature
    public final long b(String currencyString) {
        Intrinsics.i(currencyString, "currencyString");
        StringBuilder sb = new StringBuilder();
        int length = currencyString.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = currencyString.charAt(i);
            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            string = null;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < string.length(); i3++) {
                if (string.charAt(i3) == '.') {
                    i2++;
                }
            }
            if (i2 > 1) {
                string = null;
            }
        }
        if (string == null || string.length() == 0) {
            return 0L;
        }
        CityAppModel cityAppModel = (CityAppModel) this.c.getE().getValue();
        String string2 = new KBigDecimal(string).f10430a.multiply(new BigDecimal(new KBigDecimal(String.valueOf(cityAppModel != null ? cityAppModel.r.c : 100L)).toString())).toString();
        Intrinsics.h(string2, "toString(...)");
        return new KBigDecimal(string2).f10430a.longValue();
    }

    @Override // app.chalo.features.wallet.CurrencyFeature
    public final boolean c(String input) {
        Intrinsics.i(input, "input");
        for (int i = 0; i < input.length(); i++) {
            char cCharAt = input.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != '.' && !Intrinsics.d(String.valueOf(cCharAt), d())) {
                return true;
            }
        }
        return false;
    }

    @Override // app.chalo.features.wallet.CurrencyFeature
    public final String d() {
        String str;
        CityAppModel cityAppModel = (CityAppModel) this.c.getE().getValue();
        return (cityAppModel == null || (str = cityAppModel.r.b) == null) ? "₹" : str;
    }

    @Override // app.chalo.features.wallet.CurrencyFeature
    public final String e(double d) {
        KBigDecimal kBigDecimalC = new KBigDecimal(String.valueOf(d)).c(2, ChaloRoundingMode.HALF_UP);
        return d() + kBigDecimalC;
    }

    @Override // app.chalo.features.wallet.CurrencyFeature
    public final double f(long j, CurrencyRoundOffLogic roundOffLogic) {
        Intrinsics.i(roundOffLogic, "roundOffLogic");
        return this.f2767a.a(j, roundOffLogic);
    }
}
