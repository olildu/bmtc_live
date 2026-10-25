package app.chalo.usecase;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetRoundedOffAmountInSubcurrencyUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRoundedOffAmountInSubcurrencyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f10193a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10194a;

        static {
            int[] iArr = new int[CurrencyRoundOffLogic.values().length];
            try {
                iArr[CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrencyRoundOffLogic.ROUND_OFF_LOGIC_ROUND_OFF_TO_NEAREST_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10194a = iArr;
        }
    }

    public GetRoundedOffAmountInSubcurrencyUseCase(CityProvider cityProvider) {
        this.f10193a = cityProvider;
    }

    public final long a(long j, CurrencyRoundOffLogic roundOffLogic) {
        long j2;
        Intrinsics.i(roundOffLogic, "roundOffLogic");
        CityAppModel cityAppModel = (CityAppModel) this.f10193a.b().getValue();
        long j3 = cityAppModel != null ? cityAppModel.r.c : 100L;
        int i = WhenMappings.f10194a[roundOffLogic.ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j - (j % j3);
        }
        if (i == 3) {
            j2 = j % j3;
            if (j2 == 0) {
                return j;
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = j % j3;
            double d = j3 / 2.0d;
            if (j2 == 0) {
                return j;
            }
            if (j2 < d) {
                return j - j2;
            }
        }
        return (j3 - j2) + j;
    }
}
