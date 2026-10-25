package app.chalo.uistate.dialog;

import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.yv;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DatePickerUIStateFactory;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DatePickerUIStateFactory implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DatePickerUIStateFactory f9980a;
    public static final Object b;
    public static final Object c;
    public static final Lazy d;

    static {
        final DatePickerUIStateFactory datePickerUIStateFactory = new DatePickerUIStateFactory();
        f9980a = datePickerUIStateFactory;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<CityProvider>() { // from class: app.chalo.uistate.dialog.DatePickerUIStateFactory$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9982a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CityProvider.class), null, null);
            }
        });
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<StringProvider>() { // from class: app.chalo.uistate.dialog.DatePickerUIStateFactory$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9983a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(StringProvider.class), null, null);
            }
        });
        d = LazyKt.b(new yv(1));
    }

    public static DatePickerUIStateFactory$selectableDateFromRange$1 a(long j, long j2) {
        return new DatePickerUIStateFactory$selectableDateFromRange$1(j, j2);
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x011a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Object b(DatePickerContract datePickerContract, String str, final Function0 function0, final Function1 function1, final Function0 function2, ContinuationImpl continuationImpl) {
        DatePickerUIStateFactory$standard$1 datePickerUIStateFactory$standard$1;
        DatePickerUIEventHandler datePickerUIEventHandler;
        Object obj;
        String str2;
        DatePickerContract datePickerContract2;
        String str3;
        DatePickerUIEventHandler datePickerUIEventHandler2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        DatePickerContract datePickerContract3;
        String str4;
        DatePickerUIEventHandler datePickerUIEventHandler3;
        UITextStyle uITextStyle;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        if (continuationImpl instanceof DatePickerUIStateFactory$standard$1) {
            datePickerUIStateFactory$standard$1 = (DatePickerUIStateFactory$standard$1) continuationImpl;
            int i = datePickerUIStateFactory$standard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                datePickerUIStateFactory$standard$1.label = i - Integer.MIN_VALUE;
            } else {
                datePickerUIStateFactory$standard$1 = new DatePickerUIStateFactory$standard$1(this, continuationImpl);
            }
        } else {
            datePickerUIStateFactory$standard$1 = new DatePickerUIStateFactory$standard$1(this, continuationImpl);
        }
        Object obj2 = datePickerUIStateFactory$standard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = datePickerUIStateFactory$standard$1.label;
        ?? r5 = c;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        if (i2 == 0) {
            ResultKt.b(obj2);
            DatePickerUIEventHandler datePickerUIEventHandler4 = new DatePickerUIEventHandler() { // from class: app.chalo.uistate.dialog.DatePickerUIStateFactory$standard$2
                @Override // app.chalo.uistate.dialog.DatePickerUIEventHandler
                public final void a() {
                    function2.invoke();
                }

                @Override // app.chalo.uistate.dialog.DatePickerUIEventHandler
                public final void b(Long l) {
                    function1.invoke(l);
                }

                @Override // app.chalo.uistate.dialog.DatePickerUIEventHandler
                public final void onDismiss() {
                    function0.invoke();
                }
            };
            datePickerUIStateFactory$standard$1.L$0 = datePickerContract;
            datePickerUIStateFactory$standard$1.L$1 = str;
            datePickerUIStateFactory$standard$1.L$2 = null;
            datePickerUIStateFactory$standard$1.L$3 = datePickerUIEventHandler4;
            datePickerUIStateFactory$standard$1.label = 1;
            Object objB = ((StringProvider) r5.getValue()).b(StringEnum.OK_CAPS, new Object[0], datePickerUIStateFactory$standard$1);
            if (objB != coroutineSingletons) {
                datePickerUIEventHandler = datePickerUIEventHandler4;
                obj = objB;
                str2 = null;
                datePickerContract2 = datePickerContract;
                str3 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            DatePickerUIStateFactory$standard$2 datePickerUIStateFactory$standard$2 = (DatePickerUIStateFactory$standard$2) datePickerUIStateFactory$standard$1.L$3;
            String str5 = (String) datePickerUIStateFactory$standard$1.L$2;
            String str6 = (String) datePickerUIStateFactory$standard$1.L$1;
            DatePickerContract datePickerContract4 = (DatePickerContract) datePickerUIStateFactory$standard$1.L$0;
            ResultKt.b(obj2);
            datePickerUIEventHandler = datePickerUIStateFactory$standard$2;
            str3 = str6;
            str2 = str5;
            obj = obj2;
            datePickerContract2 = datePickerContract4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextUIState = (TextUIState.ChaloTextUIState) datePickerUIStateFactory$standard$1.L$3;
            datePickerUIEventHandler3 = (DatePickerUIStateFactory$standard$2) datePickerUIStateFactory$standard$1.L$2;
            str4 = (String) datePickerUIStateFactory$standard$1.L$1;
            datePickerContract3 = (DatePickerContract) datePickerUIStateFactory$standard$1.L$0;
            ResultKt.b(obj2);
        }
        str2 = (String) obj2;
        datePickerContract2 = datePickerContract3;
        datePickerUIEventHandler2 = datePickerUIEventHandler3;
        str3 = str4;
        String str7 = str2;
        uITextStyle = UITextStyle.BodyMedium;
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(str7, uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (str3 != null) {
            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        } else {
            chaloTextUIState2 = null;
        }
        return new DatePickerUIState(datePickerContract2, datePickerUIEventHandler2, chaloTextUIState2, chaloTextUIState, chaloTextUIState3);
        datePickerUIEventHandler2 = datePickerUIEventHandler;
        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (str2 == null) {
            datePickerUIStateFactory$standard$1.L$0 = datePickerContract2;
            datePickerUIStateFactory$standard$1.L$1 = str3;
            datePickerUIStateFactory$standard$1.L$2 = datePickerUIEventHandler2;
            datePickerUIStateFactory$standard$1.L$3 = chaloTextUIState4;
            datePickerUIStateFactory$standard$1.label = 2;
            Object objB2 = ((StringProvider) r5.getValue()).b(StringEnum.CANCEL_CAPS, new Object[0], datePickerUIStateFactory$standard$1);
            if (objB2 != coroutineSingletons) {
                datePickerContract3 = datePickerContract2;
                obj2 = objB2;
                str4 = str3;
                datePickerUIEventHandler3 = datePickerUIEventHandler2;
                chaloTextUIState = chaloTextUIState4;
                str2 = (String) obj2;
                datePickerContract2 = datePickerContract3;
                datePickerUIEventHandler2 = datePickerUIEventHandler3;
                str3 = str4;
            }
            return coroutineSingletons;
        }
        chaloTextUIState = chaloTextUIState4;
        String str8 = str2;
        uITextStyle = UITextStyle.BodyMedium;
        TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(str8, uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (str3 != null) {
            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        } else {
            chaloTextUIState2 = null;
        }
        return new DatePickerUIState(datePickerContract2, datePickerUIEventHandler2, chaloTextUIState2, chaloTextUIState, chaloTextUIState5);
    }
}
