package app.chalo.premiumbus.domain;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUISpecs;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PricingEngineRuleExpiryBannerUIStateBuilderKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(long j, long j2, TimeUtilsContract timeUtilsContract, StringProvider stringProvider, ChaloPadding chaloPadding, UIShape uIShape, ContinuationImpl continuationImpl) {
        PricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1 pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1;
        Pair pair;
        ChaloPadding chaloPadding2;
        UIShape uIShape2;
        PricingEngineRuleExpiryDisplayState pricingEngineRuleExpiryDisplayState;
        String str;
        if (continuationImpl instanceof PricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1) {
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1 = (PricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1) continuationImpl;
            int i = pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1 = new PricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1(continuationImpl);
            }
        } else {
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1 = new PricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1(continuationImpl);
        }
        Object obj = pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PricingEngineRuleExpiryDisplayState pricingEngineRuleExpiryDisplayStateA = PricingEngineRuleExpiryDisplayResolverKt.a(j, j2);
            if (pricingEngineRuleExpiryDisplayStateA instanceof PricingEngineRuleExpiryDisplayState.DateEnding) {
                pair = new Pair(StringEnum.OFFER_ENDS_ON_DATE, timeUtilsContract.h(((PricingEngineRuleExpiryDisplayState.DateEnding) pricingEngineRuleExpiryDisplayStateA).f7227a));
            } else if (pricingEngineRuleExpiryDisplayStateA instanceof PricingEngineRuleExpiryDisplayState.CountdownNormal) {
                pair = new Pair(StringEnum.OFFER_EXPIRES_IN_HOURS, timeUtilsContract.L(((PricingEngineRuleExpiryDisplayState.CountdownNormal) pricingEngineRuleExpiryDisplayStateA).f7225a));
            } else {
                if (!(pricingEngineRuleExpiryDisplayStateA instanceof PricingEngineRuleExpiryDisplayState.CountdownUrgent)) {
                    if (pricingEngineRuleExpiryDisplayStateA.equals(PricingEngineRuleExpiryDisplayState.Expired.f7228a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(StringEnum.OFFER_EXPIRES_IN_MINUTES, timeUtilsContract.L(((PricingEngineRuleExpiryDisplayState.CountdownUrgent) pricingEngineRuleExpiryDisplayStateA).f7226a));
            }
            StringEnum stringEnum = (StringEnum) pair.getFirst();
            String str2 = (String) pair.getSecond();
            chaloPadding2 = chaloPadding;
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$0 = chaloPadding2;
            uIShape2 = uIShape;
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$1 = uIShape2;
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$2 = pricingEngineRuleExpiryDisplayStateA;
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$3 = str2;
            pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.label = 1;
            Object objB = stringProvider.b(stringEnum, new Object[]{str2}, pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1);
            if (objB == obj2) {
                return obj2;
            }
            pricingEngineRuleExpiryDisplayState = pricingEngineRuleExpiryDisplayStateA;
            obj = objB;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$3;
            pricingEngineRuleExpiryDisplayState = (PricingEngineRuleExpiryDisplayState) pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$2;
            UIShape uIShape3 = (UIShape) pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$1;
            ChaloPadding chaloPadding3 = (ChaloPadding) pricingEngineRuleExpiryBannerUIStateBuilderKt$buildRuleExpiryBannerUIState$1.L$0;
            ResultKt.b(obj);
            chaloPadding2 = chaloPadding3;
            uIShape2 = uIShape3;
        }
        String str3 = (String) obj;
        String strH0 = StringsKt.h0(str3, str);
        String strE0 = StringsKt.e0(str3, str, "");
        IconType iconType = pricingEngineRuleExpiryDisplayState instanceof PricingEngineRuleExpiryDisplayState.DateEnding ? IconType.IC_ALARM_CLOCK : IconType.IC_BOLT;
        boolean z = pricingEngineRuleExpiryDisplayState instanceof PricingEngineRuleExpiryDisplayState.CountdownUrgent;
        ChaloColorToken chaloColorToken = z ? ChaloColorToken.DarkRed.f9786a : ChaloColorToken.DarkGreen.f9783a;
        ListBuilder listBuilderY = CollectionsKt.y();
        UIFontWeight uIFontWeight = UIFontWeight.Normal;
        UITextStyle uITextStyle = UITextStyle.BodySmall;
        ChaloColorToken chaloColorToken2 = chaloColorToken;
        listBuilderY.add(new StyledTextDataUIState(strH0, chaloColorToken2, uIFontWeight, uITextStyle, null, null, null, 1008));
        UIFontWeight uIFontWeight2 = UIFontWeight.SemiBold;
        listBuilderY.add(new StyledTextDataUIState(str, chaloColorToken2, uIFontWeight2, uITextStyle, null, null, null, 1008));
        if (strE0.length() > 0) {
            listBuilderY.add(new StyledTextDataUIState(strE0, chaloColorToken, uIFontWeight2, uITextStyle, null, null, null, 1008));
        }
        return new PricingEngineRuleExpiryBannerUIState(new TextUIState.StyledTextUIState(listBuilderY.g(), null, null, 30), new ImageUIState(iconType, (String) null, chaloColorToken, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), new PricingEngineRuleExpiryBannerUISpecs(CollectionsKt.S(z ? ChaloColorToken.RedBase.f9846a : ChaloColorToken.GreenBase.f9800a, ChaloColorToken.White.f9870a), uIShape2, chaloPadding2));
    }
}
