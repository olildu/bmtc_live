package app.chalo.onboarding.cityselection.ui;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.CircularProgressIndicatorUIStateFactory;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.error.StandardErrorScreenUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIStateFactory;
import defpackage.bp;
import defpackage.g0;
import defpackage.ti;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionUIStateFactory;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CitySelectionUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f6636a;

    public CitySelectionUIStateFactory(StringProvider stringProvider) {
        this.f6636a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:18:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.onboarding.cityselection.ui.CitySelectionDataState r26, kotlin.jvm.functions.Function1 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory.a(app.chalo.onboarding.cityselection.ui.CitySelectionDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(BasicCityInfoAppModel basicCityInfoAppModel, CitySelectionDataState citySelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        CitySelectionUIStateFactory$cityListItemUIState$1 citySelectionUIStateFactory$cityListItemUIState$1;
        boolean zD;
        TextUIState styledTextUIState;
        ImageUIState imageUIState;
        Object objC;
        Function1 function2;
        int i;
        BasicCityInfoAppModel basicCityInfoAppModel2 = basicCityInfoAppModel;
        if (continuationImpl instanceof CitySelectionUIStateFactory$cityListItemUIState$1) {
            citySelectionUIStateFactory$cityListItemUIState$1 = (CitySelectionUIStateFactory$cityListItemUIState$1) continuationImpl;
            int i2 = citySelectionUIStateFactory$cityListItemUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                citySelectionUIStateFactory$cityListItemUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                citySelectionUIStateFactory$cityListItemUIState$1 = new CitySelectionUIStateFactory$cityListItemUIState$1(this, continuationImpl);
            }
        } else {
            citySelectionUIStateFactory$cityListItemUIState$1 = new CitySelectionUIStateFactory$cityListItemUIState$1(this, continuationImpl);
        }
        Object obj = citySelectionUIStateFactory$cityListItemUIState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = citySelectionUIStateFactory$cityListItemUIState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        if (i3 == 0) {
            ResultKt.b(obj);
            String str = basicCityInfoAppModel2.f5567a;
            String str2 = basicCityInfoAppModel2.b;
            zD = Intrinsics.d(str, citySelectionDataState.b);
            String str3 = citySelectionDataState.c;
            ArrayList arrayList = new ArrayList();
            ChaloColorToken chaloColorToken = zD ? orangePrimary : ChaloColorToken.Black_87.f9768a;
            UIFontWeight uIFontWeight = zD ? UIFontWeight.SemiBold : UIFontWeight.Normal;
            if (StringsKt.F(str3) || !StringsKt.m(str2, str3, true)) {
                arrayList.add(new StyledTextDataUIState(basicCityInfoAppModel2.b, chaloColorToken, uIFontWeight, UITextStyle.DisplaySmall, null, null, null, 1008));
            } else {
                ArrayList arrayList2 = new ArrayList();
                int iD = StringsKt.D(str2, str3, 0, true, 2);
                if (iD == -1) {
                    arrayList2.add(new StyledTextDataUIState(basicCityInfoAppModel2.b, chaloColorToken, uIFontWeight, UITextStyle.DisplaySmall, null, null, null, 1008));
                } else {
                    if (iD != 0) {
                        String strSubstring = str2.substring(0, iD);
                        Intrinsics.h(strSubstring, "substring(...)");
                        i = iD;
                        arrayList2.add(new StyledTextDataUIState(strSubstring, chaloColorToken, uIFontWeight, UITextStyle.DisplaySmall, null, null, null, 1008));
                    } else {
                        i = iD;
                    }
                    String strSubstring2 = str2.substring(i, Math.min(str3.length() + i, str2.length()));
                    Intrinsics.h(strSubstring2, "substring(...)");
                    UITextStyle uITextStyle = UITextStyle.DisplaySmall;
                    arrayList2.add(new StyledTextDataUIState(strSubstring2, ChaloColorToken.ViewScheduleColor.f9869a, uIFontWeight, uITextStyle, null, null, null, 1008));
                    int length = str3.length() + i;
                    if (length != str2.length()) {
                        String strSubstring3 = str2.substring(length, str2.length());
                        Intrinsics.h(strSubstring3, "substring(...)");
                        arrayList2.add(new StyledTextDataUIState(strSubstring3, chaloColorToken, uIFontWeight, uITextStyle, null, null, null, 1008));
                    }
                }
                arrayList.addAll(arrayList2);
            }
            imageUIState = null;
            styledTextUIState = new TextUIState.StyledTextUIState(arrayList, null, null, 30);
            citySelectionUIStateFactory$cityListItemUIState$1.L$0 = basicCityInfoAppModel2;
            citySelectionUIStateFactory$cityListItemUIState$1.L$1 = function1;
            citySelectionUIStateFactory$cityListItemUIState$1.L$2 = styledTextUIState;
            citySelectionUIStateFactory$cityListItemUIState$1.Z$0 = zD;
            citySelectionUIStateFactory$cityListItemUIState$1.label = 1;
            objC = c(basicCityInfoAppModel2, citySelectionUIStateFactory$cityListItemUIState$1);
            if (objC == obj2) {
                return obj2;
            }
            function2 = function1;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z = citySelectionUIStateFactory$cityListItemUIState$1.Z$0;
            styledTextUIState = (TextUIState) citySelectionUIStateFactory$cityListItemUIState$1.L$2;
            function2 = (Function1) citySelectionUIStateFactory$cityListItemUIState$1.L$1;
            BasicCityInfoAppModel basicCityInfoAppModel3 = (BasicCityInfoAppModel) citySelectionUIStateFactory$cityListItemUIState$1.L$0;
            ResultKt.b(obj);
            zD = z;
            basicCityInfoAppModel2 = basicCityInfoAppModel3;
            objC = obj;
            imageUIState = null;
        }
        TextUIState textUIState = (TextUIState) objC;
        if (zD) {
            imageUIState = new ImageUIState(IconType.SELECTED_LANG, (String) null, orangePrimary, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250);
        }
        return new CitySelectionListItemsUIState.CityListItemUIState(styledTextUIState, textUIState, imageUIState, UiEventHandler.Companion.a(new ti(function2, basicCityInfoAppModel2, 19)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r2 == r4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.models.BasicCityInfoAppModel r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory$cityTagUIState$1
            if (r3 == 0) goto L19
            r3 = r2
            app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory$cityTagUIState$1 r3 = (app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory$cityTagUIState$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory$cityTagUIState$1 r3 = new app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory$cityTagUIState$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L3d
            if (r5 == r8) goto L39
            if (r5 != r7) goto L31
            kotlin.ResultKt.b(r2)
            goto L69
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.ResultKt.b(r2)
            goto L54
        L3d:
            kotlin.ResultKt.b(r2)
            boolean r2 = r1.c
            r5 = 0
            app.chalo.providers.stringprovider.StringProvider r9 = r0.f6636a
            if (r2 == 0) goto L58
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.BETA_CAPS
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3.label = r8
            java.lang.Object r2 = r9.b(r1, r2, r3)
            if (r2 != r4) goto L54
            goto L68
        L54:
            java.lang.String r2 = (java.lang.String) r2
        L56:
            r8 = r2
            goto L6d
        L58:
            boolean r1 = r1.d
            if (r1 == 0) goto L6c
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.COMING_SOON_CAPS
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3.label = r7
            java.lang.Object r2 = r9.b(r1, r2, r3)
            if (r2 != r4) goto L69
        L68:
            return r4
        L69:
            java.lang.String r2 = (java.lang.String) r2
            goto L56
        L6c:
            r8 = r6
        L6d:
            if (r8 == 0) goto L88
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r7 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            app.chalo.uistate.text.UITextStyle r9 = app.chalo.uistate.text.UITextStyle.TitleLarge
            r19 = 0
            r20 = 8184(0x1ff8, float:1.1468E-41)
            app.chalo.uistate.base.ChaloColorToken$OrangePrimary r10 = app.chalo.uistate.base.ChaloColorToken.OrangePrimary.f9835a
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r7
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.cityselection.ui.CitySelectionUIStateFactory.c(app.chalo.models.BasicCityInfoAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0219  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(CitySelectionDataState citySelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        CitySelectionUIStateFactory$convertToUIState$1 citySelectionUIStateFactory$convertToUIState$1;
        CircularProgressIndicatorUIState circularProgressIndicatorUIStateA;
        CitySelectionDataState citySelectionDataState2;
        StandardErrorScreenUIState standardErrorScreenUIStateB;
        Function1 function2;
        IconType iconType;
        Function1 function3;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory;
        CitySelectionDataState citySelectionDataState3;
        int i;
        String str;
        Object objB;
        String str2;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory2;
        IconType iconType2;
        String str3;
        Object objB2;
        String str4;
        ToolbarUIStateFactory toolbarUIStateFactory;
        ToolbarUIStateFactory toolbarUIStateFactory2;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState2;
        Function1 function4;
        CitySelectionDataState citySelectionDataState4;
        ToolbarUIState toolbarUIState;
        ImageUIState imageUIState;
        StandardErrorScreenUIState standardErrorScreenUIState;
        ToolbarUIState toolbarUIState2;
        CitySelectionSearchPanelUIState citySelectionSearchPanelUIState;
        Object objA;
        StandardErrorScreenUIState standardErrorScreenUIState2;
        CitySelectionSearchPanelUIState citySelectionSearchPanelUIState2;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState3;
        ImageUIState imageUIState2;
        if (continuationImpl instanceof CitySelectionUIStateFactory$convertToUIState$1) {
            citySelectionUIStateFactory$convertToUIState$1 = (CitySelectionUIStateFactory$convertToUIState$1) continuationImpl;
            int i2 = citySelectionUIStateFactory$convertToUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                citySelectionUIStateFactory$convertToUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                citySelectionUIStateFactory$convertToUIState$1 = new CitySelectionUIStateFactory$convertToUIState$1(this, continuationImpl);
            }
        } else {
            citySelectionUIStateFactory$convertToUIState$1 = new CitySelectionUIStateFactory$convertToUIState$1(this, continuationImpl);
        }
        Object objB3 = citySelectionUIStateFactory$convertToUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = citySelectionUIStateFactory$convertToUIState$1.label;
        StringProvider stringProvider = this.f6636a;
        switch (i3) {
            case 0:
                ResultKt.b(objB3);
                circularProgressIndicatorUIStateA = citySelectionDataState.e ? CircularProgressIndicatorUIStateFactory.a() : null;
                if (citySelectionDataState.f) {
                    iconType = IconType.NO_INTERNET_ERROR;
                    citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState;
                    function3 = function1;
                    citySelectionUIStateFactory$convertToUIState$1.L$1 = function3;
                    citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                    StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory3 = StandardErrorScreenUIStateFactory.f10025a;
                    citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateFactory3;
                    citySelectionUIStateFactory$convertToUIState$1.L$4 = iconType;
                    citySelectionUIStateFactory$convertToUIState$1.I$0 = 0;
                    citySelectionUIStateFactory$convertToUIState$1.label = 1;
                    objB3 = stringProvider.b(StringEnum.CONNECTION_ERROR, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                    if (objB3 != obj) {
                        standardErrorScreenUIStateFactory = standardErrorScreenUIStateFactory3;
                        citySelectionDataState3 = citySelectionDataState;
                        i = 0;
                        str = (String) objB3;
                        citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState3;
                        citySelectionUIStateFactory$convertToUIState$1.L$1 = function3;
                        citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                        citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateFactory;
                        citySelectionUIStateFactory$convertToUIState$1.L$4 = iconType;
                        citySelectionUIStateFactory$convertToUIState$1.L$5 = str;
                        citySelectionUIStateFactory$convertToUIState$1.I$0 = i;
                        citySelectionUIStateFactory$convertToUIState$1.label = 2;
                        objB = stringProvider.b(StringEnum.CHECK_CONNECTION, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                        if (objB != obj) {
                            IconType iconType3 = iconType;
                            str2 = str;
                            objB3 = objB;
                            citySelectionDataState2 = citySelectionDataState3;
                            function2 = function3;
                            circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                            standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                            iconType2 = iconType3;
                            str3 = (String) objB3;
                            citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                            citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                            citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateFactory2;
                            citySelectionUIStateFactory$convertToUIState$1.L$4 = iconType2;
                            citySelectionUIStateFactory$convertToUIState$1.L$5 = str2;
                            citySelectionUIStateFactory$convertToUIState$1.L$6 = str3;
                            citySelectionUIStateFactory$convertToUIState$1.I$0 = i;
                            citySelectionUIStateFactory$convertToUIState$1.label = 3;
                            objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                            if (objB2 != obj) {
                                str4 = str3;
                                objB3 = objB2;
                                standardErrorScreenUIStateB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType2, str2, str4, (String) objB3, new bp(function2, 8), 2);
                                circularProgressIndicatorUIStateA = circularProgressIndicatorUIState;
                                citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                                citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                                citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                                citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                                toolbarUIStateFactory = ToolbarUIStateFactory.f10120a;
                                citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIStateFactory;
                                citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                                citySelectionUIStateFactory$convertToUIState$1.L$6 = null;
                                citySelectionUIStateFactory$convertToUIState$1.label = 4;
                                objB3 = stringProvider.b(StringEnum.CITY_SELECTION_ACTIVITY_TOOLBAR_TITLE, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                                if (objB3 != obj) {
                                    toolbarUIStateFactory2 = toolbarUIStateFactory;
                                    circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                                    function4 = function2;
                                    citySelectionDataState4 = citySelectionDataState2;
                                    toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, (String) objB3, 14), null, UiEventHandler.Companion.a(new bp(function4, 9)), null, ChaloThemeHelper.a().f1916a, null, null, 213);
                                    imageUIState = new ImageUIState(IconType.CITY_SELECTION_BANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                    citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState4;
                                    citySelectionUIStateFactory$convertToUIState$1.L$1 = function4;
                                    citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState2;
                                    citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                                    citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIState;
                                    citySelectionUIStateFactory$convertToUIState$1.L$5 = imageUIState;
                                    citySelectionUIStateFactory$convertToUIState$1.label = 5;
                                    objB3 = e(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                                    if (objB3 != obj) {
                                        standardErrorScreenUIState = standardErrorScreenUIStateB;
                                        toolbarUIState2 = toolbarUIState;
                                        citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                                        citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                                        citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                                        citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                                        citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                                        citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                                        citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                                        citySelectionUIStateFactory$convertToUIState$1.label = 6;
                                        objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                                        if (objA != obj) {
                                            standardErrorScreenUIState2 = standardErrorScreenUIState;
                                            citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                                            objB3 = objA;
                                            circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                                            imageUIState2 = imageUIState;
                                            return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    citySelectionDataState2 = citySelectionDataState;
                    standardErrorScreenUIStateB = null;
                    function2 = function1;
                    citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                    citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                    citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                    citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                    toolbarUIStateFactory = ToolbarUIStateFactory.f10120a;
                    citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIStateFactory;
                    citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                    citySelectionUIStateFactory$convertToUIState$1.L$6 = null;
                    citySelectionUIStateFactory$convertToUIState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.CITY_SELECTION_ACTIVITY_TOOLBAR_TITLE, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                    if (objB3 != obj) {
                        toolbarUIStateFactory2 = toolbarUIStateFactory;
                        circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                        function4 = function2;
                        citySelectionDataState4 = citySelectionDataState2;
                        toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, (String) objB3, 14), null, UiEventHandler.Companion.a(new bp(function4, 9)), null, ChaloThemeHelper.a().f1916a, null, null, 213);
                        imageUIState = new ImageUIState(IconType.CITY_SELECTION_BANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                        citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState4;
                        citySelectionUIStateFactory$convertToUIState$1.L$1 = function4;
                        citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState2;
                        citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                        citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIState;
                        citySelectionUIStateFactory$convertToUIState$1.L$5 = imageUIState;
                        citySelectionUIStateFactory$convertToUIState$1.label = 5;
                        objB3 = e(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                        if (objB3 != obj) {
                            standardErrorScreenUIState = standardErrorScreenUIStateB;
                            toolbarUIState2 = toolbarUIState;
                            citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                            citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                            citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                            citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                            citySelectionUIStateFactory$convertToUIState$1.label = 6;
                            objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                            if (objA != obj) {
                                standardErrorScreenUIState2 = standardErrorScreenUIState;
                                citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                                objB3 = objA;
                                circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                                imageUIState2 = imageUIState;
                                return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                            }
                        }
                    }
                }
                return obj;
            case 1:
                i = citySelectionUIStateFactory$convertToUIState$1.I$0;
                iconType = (IconType) citySelectionUIStateFactory$convertToUIState$1.L$4;
                standardErrorScreenUIStateFactory = (StandardErrorScreenUIStateFactory) citySelectionUIStateFactory$convertToUIState$1.L$3;
                circularProgressIndicatorUIStateA = (CircularProgressIndicatorUIState) citySelectionUIStateFactory$convertToUIState$1.L$2;
                function3 = (Function1) citySelectionUIStateFactory$convertToUIState$1.L$1;
                citySelectionDataState3 = (CitySelectionDataState) citySelectionUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB3);
                str = (String) objB3;
                citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState3;
                citySelectionUIStateFactory$convertToUIState$1.L$1 = function3;
                citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateFactory;
                citySelectionUIStateFactory$convertToUIState$1.L$4 = iconType;
                citySelectionUIStateFactory$convertToUIState$1.L$5 = str;
                citySelectionUIStateFactory$convertToUIState$1.I$0 = i;
                citySelectionUIStateFactory$convertToUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.CHECK_CONNECTION, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                if (objB != obj) {
                    IconType iconType4 = iconType;
                    str2 = str;
                    objB3 = objB;
                    citySelectionDataState2 = citySelectionDataState3;
                    function2 = function3;
                    circularProgressIndicatorUIState = circularProgressIndicatorUIStateA;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType4;
                    str3 = (String) objB3;
                    citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                    citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                    citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState;
                    citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateFactory2;
                    citySelectionUIStateFactory$convertToUIState$1.L$4 = iconType2;
                    citySelectionUIStateFactory$convertToUIState$1.L$5 = str2;
                    citySelectionUIStateFactory$convertToUIState$1.L$6 = str3;
                    citySelectionUIStateFactory$convertToUIState$1.I$0 = i;
                    citySelectionUIStateFactory$convertToUIState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                    if (objB2 != obj) {
                        str4 = str3;
                        objB3 = objB2;
                        standardErrorScreenUIStateB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType2, str2, str4, (String) objB3, new bp(function2, 8), 2);
                        circularProgressIndicatorUIStateA = circularProgressIndicatorUIState;
                        citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                        citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                        citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                        citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                        toolbarUIStateFactory = ToolbarUIStateFactory.f10120a;
                        citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIStateFactory;
                        citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                        citySelectionUIStateFactory$convertToUIState$1.L$6 = null;
                        citySelectionUIStateFactory$convertToUIState$1.label = 4;
                        objB3 = stringProvider.b(StringEnum.CITY_SELECTION_ACTIVITY_TOOLBAR_TITLE, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                        if (objB3 != obj) {
                            toolbarUIStateFactory2 = toolbarUIStateFactory;
                            circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                            function4 = function2;
                            citySelectionDataState4 = citySelectionDataState2;
                            toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, (String) objB3, 14), null, UiEventHandler.Companion.a(new bp(function4, 9)), null, ChaloThemeHelper.a().f1916a, null, null, 213);
                            imageUIState = new ImageUIState(IconType.CITY_SELECTION_BANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                            citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState4;
                            citySelectionUIStateFactory$convertToUIState$1.L$1 = function4;
                            citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState2;
                            citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                            citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$5 = imageUIState;
                            citySelectionUIStateFactory$convertToUIState$1.label = 5;
                            objB3 = e(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                            if (objB3 != obj) {
                                standardErrorScreenUIState = standardErrorScreenUIStateB;
                                toolbarUIState2 = toolbarUIState;
                                citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                                citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                                citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                                citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                                citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                                citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                                citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                                citySelectionUIStateFactory$convertToUIState$1.label = 6;
                                objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                                if (objA != obj) {
                                    standardErrorScreenUIState2 = standardErrorScreenUIState;
                                    citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                                    objB3 = objA;
                                    circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                                    imageUIState2 = imageUIState;
                                    return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                i = citySelectionUIStateFactory$convertToUIState$1.I$0;
                str2 = (String) citySelectionUIStateFactory$convertToUIState$1.L$5;
                iconType2 = (IconType) citySelectionUIStateFactory$convertToUIState$1.L$4;
                standardErrorScreenUIStateFactory2 = (StandardErrorScreenUIStateFactory) citySelectionUIStateFactory$convertToUIState$1.L$3;
                circularProgressIndicatorUIState = (CircularProgressIndicatorUIState) citySelectionUIStateFactory$convertToUIState$1.L$2;
                function2 = (Function1) citySelectionUIStateFactory$convertToUIState$1.L$1;
                citySelectionDataState2 = (CitySelectionDataState) citySelectionUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB3);
                str3 = (String) objB3;
                citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState;
                citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateFactory2;
                citySelectionUIStateFactory$convertToUIState$1.L$4 = iconType2;
                citySelectionUIStateFactory$convertToUIState$1.L$5 = str2;
                citySelectionUIStateFactory$convertToUIState$1.L$6 = str3;
                citySelectionUIStateFactory$convertToUIState$1.I$0 = i;
                citySelectionUIStateFactory$convertToUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                if (objB2 != obj) {
                    str4 = str3;
                    objB3 = objB2;
                    standardErrorScreenUIStateB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType2, str2, str4, (String) objB3, new bp(function2, 8), 2);
                    circularProgressIndicatorUIStateA = circularProgressIndicatorUIState;
                    citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                    citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                    citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                    citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                    toolbarUIStateFactory = ToolbarUIStateFactory.f10120a;
                    citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIStateFactory;
                    citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                    citySelectionUIStateFactory$convertToUIState$1.L$6 = null;
                    citySelectionUIStateFactory$convertToUIState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.CITY_SELECTION_ACTIVITY_TOOLBAR_TITLE, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                    if (objB3 != obj) {
                        toolbarUIStateFactory2 = toolbarUIStateFactory;
                        circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                        function4 = function2;
                        citySelectionDataState4 = citySelectionDataState2;
                        toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, (String) objB3, 14), null, UiEventHandler.Companion.a(new bp(function4, 9)), null, ChaloThemeHelper.a().f1916a, null, null, 213);
                        imageUIState = new ImageUIState(IconType.CITY_SELECTION_BANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                        citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState4;
                        citySelectionUIStateFactory$convertToUIState$1.L$1 = function4;
                        citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState2;
                        citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                        citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIState;
                        citySelectionUIStateFactory$convertToUIState$1.L$5 = imageUIState;
                        citySelectionUIStateFactory$convertToUIState$1.label = 5;
                        objB3 = e(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                        if (objB3 != obj) {
                            standardErrorScreenUIState = standardErrorScreenUIStateB;
                            toolbarUIState2 = toolbarUIState;
                            citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                            citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                            citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                            citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                            citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                            citySelectionUIStateFactory$convertToUIState$1.label = 6;
                            objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                            if (objA != obj) {
                                standardErrorScreenUIState2 = standardErrorScreenUIState;
                                citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                                objB3 = objA;
                                circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                                imageUIState2 = imageUIState;
                                return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                            }
                        }
                    }
                }
                return obj;
            case 3:
                String str5 = (String) citySelectionUIStateFactory$convertToUIState$1.L$6;
                str2 = (String) citySelectionUIStateFactory$convertToUIState$1.L$5;
                iconType2 = (IconType) citySelectionUIStateFactory$convertToUIState$1.L$4;
                standardErrorScreenUIStateFactory2 = (StandardErrorScreenUIStateFactory) citySelectionUIStateFactory$convertToUIState$1.L$3;
                circularProgressIndicatorUIState = (CircularProgressIndicatorUIState) citySelectionUIStateFactory$convertToUIState$1.L$2;
                function2 = (Function1) citySelectionUIStateFactory$convertToUIState$1.L$1;
                citySelectionDataState2 = (CitySelectionDataState) citySelectionUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB3);
                str4 = str5;
                standardErrorScreenUIStateB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType2, str2, str4, (String) objB3, new bp(function2, 8), 2);
                circularProgressIndicatorUIStateA = circularProgressIndicatorUIState;
                citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState2;
                citySelectionUIStateFactory$convertToUIState$1.L$1 = function2;
                citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIStateA;
                citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                toolbarUIStateFactory = ToolbarUIStateFactory.f10120a;
                citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIStateFactory;
                citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                citySelectionUIStateFactory$convertToUIState$1.L$6 = null;
                citySelectionUIStateFactory$convertToUIState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.CITY_SELECTION_ACTIVITY_TOOLBAR_TITLE, new Object[0], citySelectionUIStateFactory$convertToUIState$1);
                if (objB3 != obj) {
                    toolbarUIStateFactory2 = toolbarUIStateFactory;
                    circularProgressIndicatorUIState2 = circularProgressIndicatorUIStateA;
                    function4 = function2;
                    citySelectionDataState4 = citySelectionDataState2;
                    toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, (String) objB3, 14), null, UiEventHandler.Companion.a(new bp(function4, 9)), null, ChaloThemeHelper.a().f1916a, null, null, 213);
                    imageUIState = new ImageUIState(IconType.CITY_SELECTION_BANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                    citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState4;
                    citySelectionUIStateFactory$convertToUIState$1.L$1 = function4;
                    citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState2;
                    citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                    citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIState;
                    citySelectionUIStateFactory$convertToUIState$1.L$5 = imageUIState;
                    citySelectionUIStateFactory$convertToUIState$1.label = 5;
                    objB3 = e(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                    if (objB3 != obj) {
                        standardErrorScreenUIState = standardErrorScreenUIStateB;
                        toolbarUIState2 = toolbarUIState;
                        citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                        citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                        citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                        citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                        citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                        citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                        citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                        citySelectionUIStateFactory$convertToUIState$1.label = 6;
                        objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                        if (objA != obj) {
                            standardErrorScreenUIState2 = standardErrorScreenUIState;
                            citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                            objB3 = objA;
                            circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                            imageUIState2 = imageUIState;
                            return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                        }
                    }
                }
                return obj;
            case 4:
                toolbarUIStateFactory2 = (ToolbarUIStateFactory) citySelectionUIStateFactory$convertToUIState$1.L$4;
                standardErrorScreenUIStateB = (StandardErrorScreenUIState) citySelectionUIStateFactory$convertToUIState$1.L$3;
                circularProgressIndicatorUIState2 = (CircularProgressIndicatorUIState) citySelectionUIStateFactory$convertToUIState$1.L$2;
                Function1 function5 = (Function1) citySelectionUIStateFactory$convertToUIState$1.L$1;
                CitySelectionDataState citySelectionDataState5 = (CitySelectionDataState) citySelectionUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB3);
                citySelectionDataState4 = citySelectionDataState5;
                function4 = function5;
                toolbarUIState = new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, (String) objB3, 14), null, UiEventHandler.Companion.a(new bp(function4, 9)), null, ChaloThemeHelper.a().f1916a, null, null, 213);
                imageUIState = new ImageUIState(IconType.CITY_SELECTION_BANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                citySelectionUIStateFactory$convertToUIState$1.L$0 = citySelectionDataState4;
                citySelectionUIStateFactory$convertToUIState$1.L$1 = function4;
                citySelectionUIStateFactory$convertToUIState$1.L$2 = circularProgressIndicatorUIState2;
                citySelectionUIStateFactory$convertToUIState$1.L$3 = standardErrorScreenUIStateB;
                citySelectionUIStateFactory$convertToUIState$1.L$4 = toolbarUIState;
                citySelectionUIStateFactory$convertToUIState$1.L$5 = imageUIState;
                citySelectionUIStateFactory$convertToUIState$1.label = 5;
                objB3 = e(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                if (objB3 != obj) {
                    standardErrorScreenUIState = standardErrorScreenUIStateB;
                    toolbarUIState2 = toolbarUIState;
                    citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                    citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                    citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                    citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                    citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                    citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                    citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                    citySelectionUIStateFactory$convertToUIState$1.label = 6;
                    objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                    if (objA != obj) {
                        standardErrorScreenUIState2 = standardErrorScreenUIState;
                        citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                        objB3 = objA;
                        circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                        imageUIState2 = imageUIState;
                        return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                    }
                }
                return obj;
            case 5:
                ImageUIState imageUIState3 = (ImageUIState) citySelectionUIStateFactory$convertToUIState$1.L$5;
                toolbarUIState2 = (ToolbarUIState) citySelectionUIStateFactory$convertToUIState$1.L$4;
                StandardErrorScreenUIState standardErrorScreenUIState3 = (StandardErrorScreenUIState) citySelectionUIStateFactory$convertToUIState$1.L$3;
                CircularProgressIndicatorUIState circularProgressIndicatorUIState4 = (CircularProgressIndicatorUIState) citySelectionUIStateFactory$convertToUIState$1.L$2;
                function4 = (Function1) citySelectionUIStateFactory$convertToUIState$1.L$1;
                citySelectionDataState4 = (CitySelectionDataState) citySelectionUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB3);
                imageUIState = imageUIState3;
                standardErrorScreenUIState = standardErrorScreenUIState3;
                circularProgressIndicatorUIState2 = circularProgressIndicatorUIState4;
                citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) objB3;
                citySelectionUIStateFactory$convertToUIState$1.L$0 = circularProgressIndicatorUIState2;
                citySelectionUIStateFactory$convertToUIState$1.L$1 = standardErrorScreenUIState;
                citySelectionUIStateFactory$convertToUIState$1.L$2 = toolbarUIState2;
                citySelectionUIStateFactory$convertToUIState$1.L$3 = imageUIState;
                citySelectionUIStateFactory$convertToUIState$1.L$4 = citySelectionSearchPanelUIState;
                citySelectionUIStateFactory$convertToUIState$1.L$5 = null;
                citySelectionUIStateFactory$convertToUIState$1.label = 6;
                objA = a(citySelectionDataState4, function4, citySelectionUIStateFactory$convertToUIState$1);
                if (objA != obj) {
                    standardErrorScreenUIState2 = standardErrorScreenUIState;
                    citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState;
                    objB3 = objA;
                    circularProgressIndicatorUIState3 = circularProgressIndicatorUIState2;
                    imageUIState2 = imageUIState;
                    return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
                }
                return obj;
            case 6:
                CitySelectionSearchPanelUIState citySelectionSearchPanelUIState3 = (CitySelectionSearchPanelUIState) citySelectionUIStateFactory$convertToUIState$1.L$4;
                ImageUIState imageUIState4 = (ImageUIState) citySelectionUIStateFactory$convertToUIState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) citySelectionUIStateFactory$convertToUIState$1.L$2;
                StandardErrorScreenUIState standardErrorScreenUIState4 = (StandardErrorScreenUIState) citySelectionUIStateFactory$convertToUIState$1.L$1;
                CircularProgressIndicatorUIState circularProgressIndicatorUIState5 = (CircularProgressIndicatorUIState) citySelectionUIStateFactory$convertToUIState$1.L$0;
                ResultKt.b(objB3);
                citySelectionSearchPanelUIState2 = citySelectionSearchPanelUIState3;
                circularProgressIndicatorUIState3 = circularProgressIndicatorUIState5;
                imageUIState2 = imageUIState4;
                standardErrorScreenUIState2 = standardErrorScreenUIState4;
                return new CitySelectionUIState(circularProgressIndicatorUIState3, standardErrorScreenUIState2, toolbarUIState2, imageUIState2, citySelectionSearchPanelUIState2, (List) objB3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object e(CitySelectionDataState citySelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        CitySelectionUIStateFactory$searchPanelUIState$1 citySelectionUIStateFactory$searchPanelUIState$1;
        ImageUIState imageUIState;
        TextFieldEventHandler textFieldEventHandler;
        UITextStyle uITextStyle;
        String str;
        UITextFieldColors uITextFieldColors;
        Function1 function2 = function1;
        if (continuationImpl instanceof CitySelectionUIStateFactory$searchPanelUIState$1) {
            citySelectionUIStateFactory$searchPanelUIState$1 = (CitySelectionUIStateFactory$searchPanelUIState$1) continuationImpl;
            int i = citySelectionUIStateFactory$searchPanelUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                citySelectionUIStateFactory$searchPanelUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                citySelectionUIStateFactory$searchPanelUIState$1 = new CitySelectionUIStateFactory$searchPanelUIState$1(this, continuationImpl);
            }
        } else {
            citySelectionUIStateFactory$searchPanelUIState$1 = new CitySelectionUIStateFactory$searchPanelUIState$1(this, continuationImpl);
        }
        Object objB = citySelectionUIStateFactory$searchPanelUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = citySelectionUIStateFactory$searchPanelUIState$1.label;
        ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                imageUIState = (ImageUIState) citySelectionUIStateFactory$searchPanelUIState$1.L$1;
                function2 = (Function1) citySelectionUIStateFactory$searchPanelUIState$1.L$0;
                ResultKt.b(objB);
                return new CitySelectionSearchPanelUIState.SearchBarCard(UiEventHandler.Companion.a(new bp(function2, 11)), imageUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            }
            uITextFieldColors = (UITextFieldColors) citySelectionUIStateFactory$searchPanelUIState$1.L$3;
            uITextStyle = (UITextStyle) citySelectionUIStateFactory$searchPanelUIState$1.L$2;
            textFieldEventHandler = (TextFieldEventHandler) citySelectionUIStateFactory$searchPanelUIState$1.L$1;
            str = (String) citySelectionUIStateFactory$searchPanelUIState$1.L$0;
            ResultKt.b(objB);
            TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            float f = ChaloThemeHelper.a().i;
            return new CitySelectionSearchPanelUIState.SearchBarTextField(new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandler, uITextStyle, null, textLabel, null, false, null, 0, new UIShape.Rectangle(f, f, f, f), uITextFieldColors, 0.0f, 81836));
        }
        ResultKt.b(objB);
        boolean z = citySelectionDataState.g;
        StringProvider stringProvider = this.f6636a;
        if (z) {
            String str2 = citySelectionDataState.c;
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new g0(function2, 28), null);
            UITextStyle uITextStyle2 = UITextStyle.BodyLarge;
            UITextFieldColors uITextFieldColors2 = new UITextFieldColors(black_60, black_60, null, null, null, null, null, null, null, null, null, null, 3538940);
            citySelectionUIStateFactory$searchPanelUIState$1.L$0 = str2;
            citySelectionUIStateFactory$searchPanelUIState$1.L$1 = textFieldEventHandlerHelper$basic$3B;
            citySelectionUIStateFactory$searchPanelUIState$1.L$2 = uITextStyle2;
            citySelectionUIStateFactory$searchPanelUIState$1.L$3 = uITextFieldColors2;
            citySelectionUIStateFactory$searchPanelUIState$1.label = 1;
            Object objB2 = stringProvider.b(StringEnum.HINT_CITY_NAME, new Object[0], citySelectionUIStateFactory$searchPanelUIState$1);
            if (objB2 != coroutineSingletons) {
                textFieldEventHandler = textFieldEventHandlerHelper$basic$3B;
                uITextStyle = uITextStyle2;
                objB = objB2;
                str = str2;
                uITextFieldColors = uITextFieldColors2;
                TextFieldLabelPlaceholderUIState.TextLabel textLabel2 = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                float f2 = ChaloThemeHelper.a().i;
                return new CitySelectionSearchPanelUIState.SearchBarTextField(new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandler, uITextStyle, null, textLabel2, null, false, null, 0, new UIShape.Rectangle(f2, f2, f2, f2), uITextFieldColors, 0.0f, 81836));
            }
        } else {
            ImageUIState imageUIState2 = new ImageUIState(IconType.SEARCH_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            citySelectionUIStateFactory$searchPanelUIState$1.L$0 = function2;
            citySelectionUIStateFactory$searchPanelUIState$1.L$1 = imageUIState2;
            citySelectionUIStateFactory$searchPanelUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.TITLE_CITY_SEARCH, new Object[0], citySelectionUIStateFactory$searchPanelUIState$1);
            if (objB != coroutineSingletons) {
                imageUIState = imageUIState2;
                return new CitySelectionSearchPanelUIState.SearchBarCard(UiEventHandler.Companion.a(new bp(function2, 11)), imageUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.Black_40.f9764a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            }
        }
        return coroutineSingletons;
    }
}
