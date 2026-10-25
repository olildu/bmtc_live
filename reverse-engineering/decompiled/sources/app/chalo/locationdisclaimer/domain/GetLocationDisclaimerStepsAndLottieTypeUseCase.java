package app.chalo.locationdisclaimer.domain;

import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.PlatformFeature;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/domain/GetLocationDisclaimerStepsAndLottieTypeUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLocationDisclaimerStepsAndLottieTypeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5174a;

    public GetLocationDisclaimerStepsAndLottieTypeUseCase(StringProvider stringProvider) {
        this.f5174a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0111  */
    /* JADX WARN: Code duplicated, block: B:26:0x015a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0251  */
    /* JADX WARN: Code duplicated, block: B:44:0x0295  */
    /* JADX WARN: Code duplicated, block: B:48:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1 getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1;
        int i;
        TextUIState[] textUIStateArr;
        int i2;
        TextUIState[] textUIStateArr2;
        TextUIState[] textUIStateArr3;
        Object objB;
        TextUIState[] textUIStateArr4;
        TextUIState[] textUIStateArr5;
        int i3;
        TextUIState[] textUIStateArr6;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Object objB2;
        int i4;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        int i5;
        TextUIState[] textUIStateArr7;
        TextUIState[] textUIStateArr8;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        int i6;
        ChaloColorToken.Black_87 black_87;
        Object objB3;
        int i7;
        TextUIState[] textUIStateArr9;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        StyledTextDataUIState[] styledTextDataUIStateArr5;
        TextUIState[] textUIStateArr10;
        TextUIState[] textUIStateArr11;
        ChaloColorToken.Black_87 black_88;
        int i8;
        Object objB4;
        TextUIState[] textUIStateArr12;
        int i9;
        TextUIState[] textUIStateArr13;
        StyledTextDataUIState[] styledTextDataUIStateArr6;
        Object objB5;
        int i10;
        StyledTextDataUIState[] styledTextDataUIStateArr7;
        int i11;
        TextUIState[] textUIStateArr14;
        int i12;
        ChaloColorToken.Black_87 black_89;
        TextUIState[] textUIStateArr15;
        int i13;
        StyledTextDataUIState[] styledTextDataUIStateArr8;
        TextUIState[] textUIStateArr16;
        if (continuationImpl instanceof GetLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1) {
            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1 = (GetLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1) continuationImpl;
            int i14 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = i14 - Integer.MIN_VALUE;
            } else {
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1 = new GetLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1 = new GetLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1(this, continuationImpl);
        }
        Object objB6 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label;
        int i16 = 1;
        StringProvider stringProvider = this.f5174a;
        ChaloColorToken.Black_87 black_810 = ChaloColorToken.Black_87.f9768a;
        switch (i15) {
            case 0:
                i = 0;
                ResultKt.b(objB6);
                float f = PlatformFeature.f10436a;
                textUIStateArr = new TextUIState[3];
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = textUIStateArr;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 0;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 1;
                objB6 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_1, new Object[0], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB6 != coroutineSingletons) {
                    i2 = 0;
                    textUIStateArr2 = textUIStateArr;
                    textUIStateArr3 = textUIStateArr2;
                    textUIStateArr[i2] = new TextUIState.ChaloTextUIState((String) objB6, UITextStyle.BodyLarge, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr3;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = textUIStateArr3;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 1;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 2;
                    objB = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_2, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                    if (objB != coroutineSingletons) {
                        textUIStateArr4 = textUIStateArr3;
                        textUIStateArr5 = textUIStateArr4;
                        objB6 = objB;
                        i3 = 1;
                        textUIStateArr6 = textUIStateArr4;
                        textUIStateArr5[i3] = new TextUIState.ChaloTextUIState((String) objB6, UITextStyle.BodyLarge, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        styledTextDataUIStateArr = new StyledTextDataUIState[2];
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr6;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr6;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 2;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = i;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 3;
                        objB2 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_3, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                        if (objB2 != coroutineSingletons) {
                            i4 = i;
                            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                            i5 = 2;
                            textUIStateArr7 = textUIStateArr6;
                            textUIStateArr8 = textUIStateArr7;
                            objB6 = objB2;
                            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                            ChaloColorToken.Black_87 black_811 = black_810;
                            i6 = i5;
                            black_87 = black_811;
                            styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(objB6 + " ", black_811, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr7;
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr3;
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr8;
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr3;
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i6;
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                            getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 4;
                            objB3 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                            if (objB3 != coroutineSingletons) {
                                i7 = i6;
                                objB6 = objB3;
                                textUIStateArr9 = textUIStateArr7;
                                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                                textUIStateArr10 = textUIStateArr8;
                                styledTextDataUIStateArr4[i16] = new StyledTextDataUIState((String) objB6, black_87, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                                textUIStateArr10[i7] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, null, 30);
                                return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr9), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i = 0;
                int i17 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                textUIStateArr = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                TextUIState[] textUIStateArr17 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                i2 = i17;
                textUIStateArr2 = textUIStateArr17;
                textUIStateArr3 = textUIStateArr2;
                textUIStateArr[i2] = new TextUIState.ChaloTextUIState((String) objB6, UITextStyle.BodyLarge, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr3;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = textUIStateArr3;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 1;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 2;
                objB = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_2, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    textUIStateArr4 = textUIStateArr3;
                    textUIStateArr5 = textUIStateArr4;
                    objB6 = objB;
                    i3 = 1;
                    textUIStateArr6 = textUIStateArr4;
                    textUIStateArr5[i3] = new TextUIState.ChaloTextUIState((String) objB6, UITextStyle.BodyLarge, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    styledTextDataUIStateArr = new StyledTextDataUIState[2];
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 2;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = i;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_3, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                    if (objB2 != coroutineSingletons) {
                        i4 = i;
                        styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                        i5 = 2;
                        textUIStateArr7 = textUIStateArr6;
                        textUIStateArr8 = textUIStateArr7;
                        objB6 = objB2;
                        styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                        ChaloColorToken.Black_87 black_812 = black_810;
                        i6 = i5;
                        black_87 = black_812;
                        styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(objB6 + " ", black_812, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr7;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr3;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr8;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr3;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i6;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 4;
                        objB3 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                        if (objB3 != coroutineSingletons) {
                            i7 = i6;
                            objB6 = objB3;
                            textUIStateArr9 = textUIStateArr7;
                            styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                            styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                            textUIStateArr10 = textUIStateArr8;
                            styledTextDataUIStateArr4[i16] = new StyledTextDataUIState((String) objB6, black_87, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                            textUIStateArr10[i7] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, null, 30);
                            return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr9), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                black_810 = black_810;
                i = 0;
                i3 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                TextUIState[] textUIStateArr18 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                textUIStateArr4 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                textUIStateArr5 = textUIStateArr18;
                textUIStateArr6 = textUIStateArr4;
                textUIStateArr5[i3] = new TextUIState.ChaloTextUIState((String) objB6, UITextStyle.BodyLarge, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                styledTextDataUIStateArr = new StyledTextDataUIState[2];
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 2;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = i;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 3;
                objB2 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_3, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB2 != coroutineSingletons) {
                    i4 = i;
                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                    i5 = 2;
                    textUIStateArr7 = textUIStateArr6;
                    textUIStateArr8 = textUIStateArr7;
                    objB6 = objB2;
                    styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
                    ChaloColorToken.Black_87 black_813 = black_810;
                    i6 = i5;
                    black_87 = black_813;
                    styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(objB6 + " ", black_813, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr7;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr3;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr8;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr3;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                    if (objB3 != coroutineSingletons) {
                        i7 = i6;
                        objB6 = objB3;
                        textUIStateArr9 = textUIStateArr7;
                        styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                        styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                        textUIStateArr10 = textUIStateArr8;
                        styledTextDataUIStateArr4[i16] = new StyledTextDataUIState((String) objB6, black_87, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                        textUIStateArr10[i7] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, null, 30);
                        return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr9), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                    }
                }
                return coroutineSingletons;
            case 3:
                black_810 = black_810;
                i = 0;
                int i18 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1;
                int i19 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr9 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3;
                TextUIState[] textUIStateArr19 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2;
                StyledTextDataUIState[] styledTextDataUIStateArr10 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                TextUIState[] textUIStateArr20 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                styledTextDataUIStateArr2 = styledTextDataUIStateArr9;
                i4 = i18;
                textUIStateArr7 = textUIStateArr20;
                i5 = i19;
                textUIStateArr8 = textUIStateArr19;
                styledTextDataUIStateArr3 = styledTextDataUIStateArr10;
                ChaloColorToken.Black_87 black_814 = black_810;
                i6 = i5;
                black_87 = black_814;
                styledTextDataUIStateArr2[i4] = new StyledTextDataUIState(objB6 + " ", black_814, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr7;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr3;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr8;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr3;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 4;
                objB3 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB3 != coroutineSingletons) {
                    i7 = i6;
                    objB6 = objB3;
                    textUIStateArr9 = textUIStateArr7;
                    styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                    styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                    textUIStateArr10 = textUIStateArr8;
                    styledTextDataUIStateArr4[i16] = new StyledTextDataUIState((String) objB6, black_87, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                    textUIStateArr10[i7] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, null, 30);
                    return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr9), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                }
                return coroutineSingletons;
            case 4:
                black_87 = black_810;
                i16 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1;
                i7 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                styledTextDataUIStateArr4 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3;
                textUIStateArr10 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2;
                styledTextDataUIStateArr5 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                textUIStateArr9 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                styledTextDataUIStateArr4[i16] = new StyledTextDataUIState((String) objB6, black_87, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                textUIStateArr10[i7] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr5), null, null, 30);
                return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr9), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
            case 5:
                int i20 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                TextUIState[] textUIStateArr21 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                textUIStateArr11 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                black_88 = black_810;
                i8 = 0;
                textUIStateArr21[i20] = new TextUIState.ChaloTextUIState((String) objB6, UITextStyle.BodyLarge, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr11;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = textUIStateArr11;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 1;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 6;
                objB4 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_2, new Object[0], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB4 != coroutineSingletons) {
                    textUIStateArr12 = textUIStateArr11;
                    i9 = 1;
                    textUIStateArr13 = textUIStateArr12;
                    textUIStateArr11[i9] = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyLarge, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    styledTextDataUIStateArr6 = new StyledTextDataUIState[2];
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr13;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr13;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 2;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = i8;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 7;
                    objB5 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_3, new Object[i8], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                    if (objB5 != coroutineSingletons) {
                        i10 = i8;
                        styledTextDataUIStateArr7 = styledTextDataUIStateArr6;
                        i11 = 2;
                        textUIStateArr14 = textUIStateArr13;
                        ChaloColorToken.Black_87 black_815 = black_88;
                        i12 = i11;
                        black_89 = black_815;
                        styledTextDataUIStateArr7[i10] = new StyledTextDataUIState(objB5 + " ", black_815, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr13;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr6;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr14;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr6;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i12;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                        getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 8;
                        objB6 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i8], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                        if (objB6 != coroutineSingletons) {
                            textUIStateArr15 = textUIStateArr13;
                            i13 = i12;
                            styledTextDataUIStateArr8 = styledTextDataUIStateArr6;
                            textUIStateArr16 = textUIStateArr14;
                            styledTextDataUIStateArr8[i16] = new StyledTextDataUIState((String) objB6, black_89, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                            textUIStateArr16[i13] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr6), null, null, 30);
                            return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr15), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                int i21 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                TextUIState[] textUIStateArr22 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                TextUIState[] textUIStateArr23 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                textUIStateArr12 = textUIStateArr23;
                black_88 = black_810;
                textUIStateArr11 = textUIStateArr22;
                i9 = i21;
                objB4 = objB6;
                i8 = 0;
                textUIStateArr13 = textUIStateArr12;
                textUIStateArr11[i9] = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.BodyLarge, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                styledTextDataUIStateArr6 = new StyledTextDataUIState[2];
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr13;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr13;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = 2;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = i8;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 7;
                objB5 = stringProvider.b(StringEnum.ALLOW_LOCATION_ACCESS_STEPS_3, new Object[i8], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB5 != coroutineSingletons) {
                    i10 = i8;
                    styledTextDataUIStateArr7 = styledTextDataUIStateArr6;
                    i11 = 2;
                    textUIStateArr14 = textUIStateArr13;
                    ChaloColorToken.Black_87 black_816 = black_88;
                    i12 = i11;
                    black_89 = black_816;
                    styledTextDataUIStateArr7[i10] = new StyledTextDataUIState(objB5 + " ", black_816, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr13;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr14;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr6;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i12;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                    getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 8;
                    objB6 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i8], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                    if (objB6 != coroutineSingletons) {
                        textUIStateArr15 = textUIStateArr13;
                        i13 = i12;
                        styledTextDataUIStateArr8 = styledTextDataUIStateArr6;
                        textUIStateArr16 = textUIStateArr14;
                        styledTextDataUIStateArr8[i16] = new StyledTextDataUIState((String) objB6, black_89, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                        textUIStateArr16[i13] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr6), null, null, 30);
                        return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr15), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                    }
                }
                return coroutineSingletons;
            case 7:
                int i22 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1;
                int i23 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr11 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3;
                TextUIState[] textUIStateArr24 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2;
                StyledTextDataUIState[] styledTextDataUIStateArr12 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                TextUIState[] textUIStateArr25 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                i10 = i22;
                textUIStateArr13 = textUIStateArr25;
                styledTextDataUIStateArr7 = styledTextDataUIStateArr11;
                styledTextDataUIStateArr6 = styledTextDataUIStateArr12;
                black_88 = black_810;
                objB5 = objB6;
                i11 = i23;
                textUIStateArr14 = textUIStateArr24;
                i8 = 0;
                ChaloColorToken.Black_87 black_817 = black_88;
                i12 = i11;
                black_89 = black_817;
                styledTextDataUIStateArr7[i10] = new StyledTextDataUIState(objB5 + " ", black_817, UIFontWeight.Normal, UITextStyle.BodyLarge, null, null, null, 1008);
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0 = textUIStateArr13;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1 = styledTextDataUIStateArr6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2 = textUIStateArr14;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3 = styledTextDataUIStateArr6;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0 = i12;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1 = 1;
                getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.label = 8;
                objB6 = stringProvider.b(StringEnum.LOCATION_ACCESS, new Object[i8], getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1);
                if (objB6 != coroutineSingletons) {
                    textUIStateArr15 = textUIStateArr13;
                    i13 = i12;
                    styledTextDataUIStateArr8 = styledTextDataUIStateArr6;
                    textUIStateArr16 = textUIStateArr14;
                    styledTextDataUIStateArr8[i16] = new StyledTextDataUIState((String) objB6, black_89, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                    textUIStateArr16[i13] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr6), null, null, 30);
                    return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr15), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
                }
                return coroutineSingletons;
            case 8:
                i16 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$1;
                i13 = getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.I$0;
                styledTextDataUIStateArr8 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$3;
                textUIStateArr16 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$2;
                styledTextDataUIStateArr6 = (StyledTextDataUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$1;
                textUIStateArr15 = (TextUIState[]) getLocationDisclaimerStepsAndLottieTypeUseCase$invoke$1.L$0;
                ResultKt.b(objB6);
                black_89 = black_810;
                styledTextDataUIStateArr8[i16] = new StyledTextDataUIState((String) objB6, black_89, UIFontWeight.Bold, UITextStyle.BodyLarge, null, null, null, 1008);
                textUIStateArr16[i13] = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr6), null, null, 30);
                return new LocationDisclaimerStepsAndLottiType(CollectionsKt.S(textUIStateArr15), new GifImageUIState(LottieType.GIF_LOCATION_PLACEHOLDER, (ImageUISize) null, 6));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
