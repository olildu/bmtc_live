package app.chalo.home.ui.history.factory;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.data.BackgroundAppModel;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.PaddingAppModel;
import app.chalo.data.TextStyleAppModel;
import app.chalo.home.ui.history.uistate.TextWithBackgroundSpec;
import app.chalo.home.ui.history.uistate.TextWithBackgroundUiState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextViewStateKt;
import app.chalo.uistate.text.TextWithSpecialFeatureBuilder;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.HtmlStyledData;
import app.chalo.utils.HtmlTextStyling;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyTicketsUiStateFactoryKt {
    public static final TextWithBackgroundUiState a(ChaloTextDataAppModel chaloTextDataAppModel) {
        Intrinsics.i(chaloTextDataAppModel, "<this>");
        Color.Companion companion = Color.INSTANCE;
        BackgroundAppModel backgroundAppModel = chaloTextDataAppModel.f2335a;
        ChaloColorToken.Custom custom = new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(companion, backgroundAppModel.f2311a, Color.INSTANCE.m4640getTransparent0d7_KjU()));
        final TextStyleAppModel textStyleAppModel = chaloTextDataAppModel.f;
        final ChaloColorToken.Custom custom2 = new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(companion, textStyleAppModel.b, ChaloColorTokenKt.c(ChaloColorToken.Black_87.f9768a)));
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIStateC = TextWithSpecialFeaturesTagsUIStateKt.c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>() { // from class: app.chalo.home.ui.history.factory.MyTicketsUiStateFactoryKt$toTextWithBackgroundUiState$textUiState$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj).f10091a;
                TextStyleAppModel textStyleAppModel2 = textStyleAppModel;
                int i = 0;
                for (Object obj2 : textStyleAppModel2.d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    HtmlStyledData htmlStyledData = (HtmlStyledData) obj2;
                    int i3 = i;
                    String str = htmlStyledData.f10426a;
                    HtmlTextStyling htmlTextStyling = htmlStyledData.b;
                    TextWithSpecialFeatureBuilder.a(arrayList, str, UITextStyle.BodyLarge, custom2, Integer.valueOf(textStyleAppModel2.c), ChaloTextViewStateKt.e(htmlTextStyling), ChaloTextViewStateKt.f(htmlTextStyling), i3 == CollectionsKt.K(textStyleAppModel2.d));
                    i = i2;
                }
                return Unit.f17538a;
            }
        }, 3);
        PaddingAppModel paddingAppModel = backgroundAppModel.c;
        TextWithBackgroundSpec textWithBackgroundSpec = new TextWithBackgroundSpec(new ChaloPadding(Dp.m7278constructorimpl(paddingAppModel.d), Dp.m7278constructorimpl(paddingAppModel.c), Dp.m7278constructorimpl(paddingAppModel.b), Dp.m7278constructorimpl(paddingAppModel.f2363a)), backgroundAppModel.b.toUiShape(), custom, Dp.m7278constructorimpl(chaloTextDataAppModel.e), Dp.m7278constructorimpl(chaloTextDataAppModel.c));
        IconType iconType = chaloTextDataAppModel.d;
        ImageUIState imageUIState = iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254) : null;
        IconType iconType2 = chaloTextDataAppModel.b;
        return new TextWithBackgroundUiState(textWithBackgroundSpec, imageUIState, textWithSpecialFeaturesTagsUIStateC, iconType2 != null ? new ImageUIState(iconType2, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254) : null);
    }
}
