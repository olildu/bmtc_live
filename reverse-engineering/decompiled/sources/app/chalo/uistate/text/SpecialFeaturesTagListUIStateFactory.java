package app.chalo.uistate.text;

import app.chalo.compose.components.ChaloRouteTagsPalette;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.UiEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/SpecialFeaturesTagListUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecialFeaturesTagListUIStateFactory {
    public static SpecialFeaturesTagListUIState a(List tags) {
        Intrinsics.i(tags, "tags");
        List<String> list = tags;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (String str : list) {
            arrayList.add(new SpecialFeaturesTagTextUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.LabelSmall, ChaloRouteTagsPalette.b(str), 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ChaloRouteTagsPalette.a(str), (UIShape) null, 12));
        }
        return new SpecialFeaturesTagListUIState(arrayList);
    }
}
