package app.chalo.home.ui.base;

import app.chalo.ads.ExitInterstitialTargetingKey;
import app.chalo.features.language.data.Language;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ads/ExitInterstitialTargetingKey;", "city", "Lapp/chalo/providers/cityprovider/impl/data/models/app/CityAppModel;", "language", "Lapp/chalo/features/language/data/Language;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.ExitInterstitialHomeTargetingResolver$flow$1", f = "ExitInterstitialHomeTargetingResolver.kt", l = {}, m = "invokeSuspend", v = 1)
final class ExitInterstitialHomeTargetingResolver$flow$1 extends SuspendLambda implements Function3<CityAppModel, Language, Continuation<? super ExitInterstitialTargetingKey>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ExitInterstitialHomeTargetingResolver$flow$1 exitInterstitialHomeTargetingResolver$flow$1 = new ExitInterstitialHomeTargetingResolver$flow$1(3, (Continuation) obj3);
        exitInterstitialHomeTargetingResolver$flow$1.L$0 = (CityAppModel) obj;
        exitInterstitialHomeTargetingResolver$flow$1.L$1 = (Language) obj2;
        return exitInterstitialHomeTargetingResolver$flow$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        String string2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CityAppModel cityAppModel = (CityAppModel) this.L$0;
        Language language = (Language) this.L$1;
        String str = cityAppModel != null ? cityAppModel.f8854a : null;
        String locale = language != null ? language.getLocale() : null;
        if (str == null || (string = StringsKt.u0(str).toString()) == null) {
            return null;
        }
        Locale locale2 = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale2);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            lowerCase = null;
        }
        if (lowerCase == null || locale == null || (string2 = StringsKt.u0(locale).toString()) == null) {
            return null;
        }
        String lowerCase2 = string2.toLowerCase(locale2);
        Intrinsics.h(lowerCase2, "toLowerCase(...)");
        if (lowerCase2.length() <= 0) {
            lowerCase2 = null;
        }
        if (lowerCase2 != null) {
            return new ExitInterstitialTargetingKey(lowerCase, lowerCase2);
        }
        return null;
    }
}
