package app.chalo.uistate.multimodal;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ShapedContentUIState;
import app.chalo.compose.theme.ShapedContentUIStateFactory;
import app.chalo.extensions.StringExtsKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.fromto.MultipleFromToStopConnectorUIState;
import app.chalo.uistate.fromto.MultipleFromToStopItemUIState;
import app.chalo.uistate.fromto.MultipleFromToStopUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureBuilder;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/StepTicketModeBasedInfoUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepTicketModeBasedInfoUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f10058a;

    public StepTicketModeBasedInfoUIStateFactory(StringProvider stringProvider) {
        this.f10058a = stringProvider;
    }

    public static StepTicketModeBasedInfoUIState.Bus a(final String routeName, String fromStop, String toStop, final List tagList) {
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        Intrinsics.i(tagList, "tagList");
        ImageUIState imageUIStateE = e(IconType.GROUP_TICKET_BUS);
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIStateC = TextWithSpecialFeaturesTagsUIStateKt.c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>() { // from class: app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory$getBusStepTicketSectionUIState$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj).f10091a;
                TextWithSpecialFeatureBuilder.b(arrayList, routeName, UITextStyle.HeadlineSmall, ChaloColorToken.AlmostBlackColor.f9756a, UIFontWeight.Bold, 104);
                TextWithSpecialFeatureBuilder.d(arrayList, tagList);
                return Unit.f17538a;
            }
        }, 3);
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().b;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ShapedContentUIState shapedContentUIStateA = ShapedContentUIStateFactory.a(f, f2, transparent, shadyGray);
        ShapedContentUIState shapedContentUIStateA2 = ShapedContentUIStateFactory.a(ChaloThemeHelper.a().d, ChaloThemeHelper.a().b, shadyGray, shadyGray);
        UITextStyle uITextStyle = UITextStyle.BodySmall;
        return new StepTicketModeBasedInfoUIState.Bus(imageUIStateE, textWithSpecialFeaturesTagsUIStateC, new FromAndToStopUIState(shapedContentUIStateA, shapedContentUIStateA2, new TextUIState.ChaloTextUIState(fromStop, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(toStop, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
    }

    public static StepTicketModeBasedInfoUIState.Bus b(StepTicketModeBasedInfoUIStateFactory stepTicketModeBasedInfoUIStateFactory, String str, String str2, String str3) {
        EmptyList emptyList = EmptyList.f17557a;
        stepTicketModeBasedInfoUIStateFactory.getClass();
        return a(str, str2, str3, emptyList);
    }

    public static StepTicketModeBasedInfoUIState.Metro d(List metroLegs) {
        String str;
        Intrinsics.i(metroLegs, "metroLegs");
        ArrayList arrayList = new ArrayList();
        MetroMultipleStopsUIModelItem metroMultipleStopsUIModelItem = (MetroMultipleStopsUIModelItem) CollectionsKt.H(metroLegs);
        if (metroMultipleStopsUIModelItem != null && (str = metroMultipleStopsUIModelItem.c) != null) {
            arrayList.add(str);
        }
        List list = metroLegs;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MetroMultipleStopsUIModelItem) it.next()).d);
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList3.add(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        }
        ImageUIState imageUIStateE = e(IconType.METRO_GROUP_TICKET);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            MetroLineContainerUIState metroLineContainerUIState = null;
            if (!it2.hasNext()) {
                break;
            }
            MetroMultipleStopsUIModelItem metroMultipleStopsUIModelItem2 = (MetroMultipleStopsUIModelItem) it2.next();
            String str2 = metroMultipleStopsUIModelItem2.f10045a;
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                ChaloColorToken chaloColorToken = metroMultipleStopsUIModelItem2.b;
                metroLineContainerUIState = new MetroLineContainerUIState(chaloColorToken, new LineIndicatorUIState(chaloColorToken), new TextUIState.ChaloTextUIState(metroMultipleStopsUIModelItem2.f10045a, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            }
            if (metroLineContainerUIState != null) {
                arrayList4.add(metroLineContainerUIState);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList3, 10));
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            TextUIState.ChaloTextUIState chaloTextUIState = (TextUIState.ChaloTextUIState) obj2;
            int i5 = i - 1;
            MetroMultipleStopsUIModelItem metroMultipleStopsUIModelItem3 = (MetroMultipleStopsUIModelItem) CollectionsKt.L(i5, metroLegs);
            ChaloColorToken chaloColorToken2 = metroMultipleStopsUIModelItem3 != null ? metroMultipleStopsUIModelItem3.b : ((MetroMultipleStopsUIModelItem) CollectionsKt.F(metroLegs)).b;
            ShapedContentUIState shapedContentUIStateA = ShapedContentUIStateFactory.a(ChaloThemeHelper.a().e, ChaloThemeHelper.a().f1916a, chaloColorToken2, chaloColorToken2);
            MetroMultipleStopsUIModelItem metroMultipleStopsUIModelItem4 = (MetroMultipleStopsUIModelItem) CollectionsKt.L(i5, metroLegs);
            MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState = metroMultipleStopsUIModelItem4 != null ? new MultipleFromToStopConnectorUIState(ChaloThemeHelper.a().b, metroMultipleStopsUIModelItem4.b) : null;
            MetroMultipleStopsUIModelItem metroMultipleStopsUIModelItem5 = (MetroMultipleStopsUIModelItem) CollectionsKt.L(i, metroLegs);
            arrayList5.add(new MultipleFromToStopItemUIState(chaloTextUIState, shapedContentUIStateA, multipleFromToStopConnectorUIState, metroMultipleStopsUIModelItem5 != null ? new MultipleFromToStopConnectorUIState(ChaloThemeHelper.a().b, metroMultipleStopsUIModelItem5.b) : null));
            i = i4;
        }
        return new StepTicketModeBasedInfoUIState.Metro(imageUIStateE, arrayList4, new MultipleFromToStopUIState(arrayList5));
    }

    public static ImageUIState e(IconType iconType) {
        return new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
    }

    public final Object c(String str, ContinuationImpl continuationImpl) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return (StringsKt.u(str, " line", true) || StringsKt.a0(str, "line ", true)) ? str : this.f10058a.b(StringEnum._METRO_LINE, new Object[]{StringExtsKt.a(str)}, continuationImpl);
    }
}
