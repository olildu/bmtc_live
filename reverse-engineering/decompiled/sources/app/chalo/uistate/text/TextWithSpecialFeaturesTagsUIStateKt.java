package app.chalo.uistate.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.utils.HtmlStyledData;
import app.chalo.utils.HtmlTextStyling;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextWithSpecialFeaturesTagsUIStateKt {
    public static final void a(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            boolean zX = StringsKt.x(str, "ac", true);
            ChaloColorToken.RealTimeFetchingStringColor realTimeFetchingStringColor = ChaloColorToken.RealTimeFetchingStringColor.f9845a;
            ChaloColorToken.White white = ChaloColorToken.White.f9870a;
            if (zX) {
                TextWithSpecialFeatureBuilder.c(arrayList, str, UITextStyle.BodySmall, white, realTimeFetchingStringColor);
            } else if (StringsKt.x(str, "fast", true)) {
                TextWithSpecialFeatureBuilder.c(arrayList, str, UITextStyle.BodySmall, white, realTimeFetchingStringColor);
            } else {
                TextWithSpecialFeatureBuilder.c(arrayList, str, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, ChaloColorToken.SpecialFeatureTagBackgroundColor.f9856a);
            }
        }
    }

    public static final TextWithSpecialFeaturesTagsUIState b(final List data, final UITextStyle style, final Integer num, final long j, Composer composer, int i) {
        Intrinsics.i(data, "data");
        Intrinsics.i(style, "style");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1539627236, i, -1, "app.chalo.uistate.text.textUIStateFromHtmlStyledData (TextWithSpecialFeaturesTagsUIState.kt:200)");
        }
        boolean z = true;
        boolean zChanged = composer.changed(data) | ((((i & 112) ^ 48) > 32 && composer.changed(style.ordinal())) || (i & 48) == 32) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(j)) || (i & 3072) == 2048);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(num)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>() { // from class: app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt$textUIStateFromHtmlStyledData$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj).f10091a;
                    int i2 = 0;
                    for (Object obj2 : data) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        HtmlStyledData htmlStyledData = (HtmlStyledData) obj2;
                        String str = htmlStyledData.f10426a;
                        HtmlTextStyling htmlTextStyling = htmlStyledData.b;
                        TextWithSpecialFeatureBuilder.a(arrayList, str, style, new ChaloColorToken.Custom(j), num, ChaloTextViewStateKt.e(htmlTextStyling), ChaloTextViewStateKt.f(htmlTextStyling), true);
                        i2 = i3;
                    }
                    return Unit.f17538a;
                }
            }, 3);
            composer.updateRememberedValue(objRememberedValue);
        }
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = (TextWithSpecialFeaturesTagsUIState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textWithSpecialFeaturesTagsUIState;
    }

    public static TextWithSpecialFeaturesTagsUIState c(float f, Function1 function1, int i) {
        int i2 = (i & 1) != 0 ? Integer.MAX_VALUE : 1;
        if ((i & 2) != 0) {
            f = ChaloThemeHelper.a().d;
        }
        ArrayList arrayList = new ArrayList();
        function1.invoke(new TextWithSpecialFeatureBuilder(arrayList));
        return new TextWithSpecialFeaturesTagsUIState(arrayList, f, i2);
    }
}
