package app.chalo.uistate.text;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import defpackage.gf;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/text/TextWithSpecialFeatureBuilder;", "", "Companion", "data", "", "Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class TextWithSpecialFeatureBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10091a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/uistate/text/TextWithSpecialFeatureBuilder$Companion;", "", "", "SPECIAL_FEATURE_TAG_NON_AC", "Ljava/lang/String;", "SPECIAL_FEATURE_TAG_AC", "SPECIAL_FEATURE_TAG_FAST", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ TextWithSpecialFeatureBuilder(ArrayList arrayList) {
        this.f10091a = arrayList;
    }

    public static final void a(ArrayList arrayList, String text, UITextStyle uITextStyle, ChaloColorToken chaloColorToken, Integer num, UIFontWeight uIFontWeight, UITextDecoration uITextDecoration, boolean z) {
        Intrinsics.i(text, "text");
        UITextStyle style = uITextStyle;
        Intrinsics.i(style, "style");
        UIFontWeight fontWeight = uIFontWeight;
        Intrinsics.i(fontWeight, "fontWeight");
        UITextDecoration textDecoration = uITextDecoration;
        Intrinsics.i(textDecoration, "textDecoration");
        String str = " ";
        List listU = StringsKt.U(text, new String[]{" "}, 6);
        List list = listU;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String strA = (String) obj;
            if (!z || i != CollectionsKt.K(listU)) {
                strA = vo1.A(strA, str);
            }
            List list2 = listU;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new TextWithSpecialFeatureDataUIState.SimpleText(new TextUIState.ChaloTextUIState(strA, style, chaloColorToken, 0, (UITextAlign) null, fontWeight, num, (UiEventHandler) null, textDecoration, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7480)));
            style = uITextStyle;
            fontWeight = uIFontWeight;
            textDecoration = uITextDecoration;
            arrayList2 = arrayList3;
            i = i2;
            str = str;
            listU = list2;
        }
        arrayList.addAll(arrayList2);
    }

    public static /* synthetic */ void b(ArrayList arrayList, String str, UITextStyle uITextStyle, ChaloColorToken chaloColorToken, UIFontWeight uIFontWeight, int i) {
        if ((i & 4) != 0) {
            chaloColorToken = null;
        }
        ChaloColorToken chaloColorToken2 = chaloColorToken;
        if ((i & 16) != 0) {
            uIFontWeight = UIFontWeight.Normal;
        }
        a(arrayList, str, uITextStyle, chaloColorToken2, null, uIFontWeight, UITextDecoration.None, (i & 64) == 0);
    }

    public static final void c(ArrayList arrayList, String text, UITextStyle style, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2) {
        Intrinsics.i(text, "text");
        Intrinsics.i(style, "style");
        arrayList.add(new TextWithSpecialFeatureDataUIState.SpecialFeature(chaloColorToken2, new TextUIState.ChaloTextUIState(text, style, chaloColorToken, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
    }

    public static final void d(ArrayList arrayList, List lSpecialFeaturesList) {
        Intrinsics.i(lSpecialFeaturesList, "lSpecialFeaturesList");
        if (lSpecialFeaturesList.isEmpty()) {
            return;
        }
        Iterator it = lSpecialFeaturesList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!StringsKt.x(str, "non-ac", true)) {
                if (StringsKt.x(str, "ac", true) || StringsKt.x(str, "fast", true)) {
                    c(arrayList, str, UITextStyle.BodySmall, ChaloColorToken.White.f9870a, ChaloColorToken.RealTimeFetchingStringColor.f9845a);
                } else {
                    c(arrayList, str, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, ChaloColorToken.SpecialFeatureTagBackgroundColor.f9856a);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextWithSpecialFeatureBuilder) {
            return this.f10091a.equals(((TextWithSpecialFeatureBuilder) obj).f10091a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10091a.hashCode();
    }

    public final String toString() {
        return gf.i("TextWithSpecialFeatureBuilder(data=", ")", this.f10091a);
    }
}
