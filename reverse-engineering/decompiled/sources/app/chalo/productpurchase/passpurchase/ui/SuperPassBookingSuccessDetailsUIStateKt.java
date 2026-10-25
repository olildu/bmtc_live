package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassBookingSuccessDetailsUIStateKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(StringProvider stringProvider, String str, Function0 function0, String str2, Function0 function1, List list, ContinuationImpl continuationImpl) {
        SuperPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1 superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1;
        String str3;
        Function0 function2;
        List list2;
        Object obj;
        String str4;
        Function0 function3;
        ChaloColorToken.Black_87 black_87;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof SuperPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1) {
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1 = (SuperPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1) continuationImpl;
            int i = superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1 = new SuperPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1(continuationImpl);
            }
        } else {
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1 = new SuperPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1(continuationImpl);
        }
        Object obj2 = superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.label;
        int i3 = 0;
        if (i2 == 0) {
            ResultKt.b(obj2);
            str3 = str;
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$0 = str3;
            function2 = function0;
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$1 = function2;
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$2 = str2;
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$3 = function1;
            list2 = list;
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$4 = list2;
            superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.NEXT_STEPS, new Object[0], superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1);
            if (objB == obj3) {
                return obj3;
            }
            obj = objB;
            str4 = str2;
            function3 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = (List) superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$4;
            function3 = (Function0) superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$3;
            String str5 = (String) superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$2;
            Function0 function4 = (Function0) superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$1;
            String str6 = (String) superPassBookingSuccessDetailsUIStateKt$superPassBookingSuccessDetailsUIState$1.L$0;
            ResultKt.b(obj2);
            list2 = list3;
            function2 = function4;
            str3 = str6;
            obj = obj2;
            str4 = str5;
        }
        UITextStyle uITextStyle = UITextStyle.HeadlineMedium;
        ChaloColorToken.Black_87 black_88 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list2) {
            Pair pair = (Pair) obj4;
            if (pair.d() != null || pair.e() != null) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj5 = arrayList.get(i4);
            i4++;
            int i5 = i3 + 1;
            TextUIState.ChaloTextUIState chaloTextUIState3 = null;
            if (i3 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Pair pair2 = (Pair) obj5;
            String str7 = (String) pair2.getFirst();
            String str8 = (String) pair2.getSecond();
            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(String.valueOf(i5), UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            if (str7 != null) {
                ChaloColorToken.Black_87 black_89 = black_88;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str7, UITextStyle.HeadlineMedium, black_89, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                black_87 = black_89;
            } else {
                black_87 = black_88;
                chaloTextUIState = null;
            }
            if (str8 != null) {
                chaloTextUIState3 = new TextUIState.ChaloTextUIState(str8, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            }
            arrayList2.add(new SuperPassBookingSuccessNextStepUIState(chaloTextUIState4, chaloTextUIState, chaloTextUIState3));
            i3 = i5;
            black_88 = black_87;
        }
        ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
        return new SuperPassBookingSuccessDetailsUIState(chaloTextUIState2, arrayList2, ButtonUIStateFactory.g(buttonUIStateFactory, str3, function2, null, null, false, 0.0f, 60), ButtonUIStateFactory.b(buttonUIStateFactory, str4, function3, null, false, 60));
    }
}
