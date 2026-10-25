package app.chalo.userprofile.ui.minprofileupdate;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.SelectableDates;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt$betweenRange$1;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.fileupload.domain.UploadFileToServerUseCase;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
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
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$maxDigits$1;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.domain.UpdateUserProfileUseCase;
import app.chalo.userprofile.domain.validation.ProfileInputValidationError;
import app.chalo.userprofile.domain.validation.ProfileInputValidator;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUISpecs;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUIState;
import app.chalo.userprofile.ui.ProfileImageUIState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import app.chalo.userprofile.utils.UserNameUtils;
import app.chalo.userprofile.utils.UserProfileDobPickerHelper;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.bj0;
import defpackage.dj0;
import defpackage.ej0;
import defpackage.qd;
import defpackage.qi0;
import defpackage.wi0;
import defpackage.zf0;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateIntent;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateDataState;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateViewState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinProfileUpdateComponent extends ChaloBaseStateMviComponent {
    public final BasicInfoContract A;
    public Job B;
    public boolean C;
    public long D;
    public long E;
    public final MinProfileUpdateArgs k;
    public final UserProfileDetailsProvider l;
    public final ChaloNavigationManager m;
    public final PermissionHandlerProvider n;
    public final ImagePickerProvider o;
    public final UpdateUserProfileUseCase p;
    public final UploadFileToServerUseCase q;
    public final StringProvider r;
    public final KotlinToastManager s;
    public final TimeUtilsContract t;
    public final SystemHelper u;
    public final ChaloAppFeatureHelper v;
    public final ProfileInputValidator w;
    public final MinProfileUpdateResultStateManager x;
    public final AnalyticsContract y;
    public final UserProfilingHooksRuleEngineDataStore z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10386a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10386a = iArr;
        }
    }

    public MinProfileUpdateComponent(ComponentContext componentContext, MinProfileUpdateArgs minProfileUpdateArgs, UserProfileDetailsProvider userProfileDetailsProvider, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, ImagePickerProvider imagePickerProvider, UpdateUserProfileUseCase updateUserProfileUseCase, UploadFileToServerUseCase uploadFileToServerUseCase, StringProvider stringProvider, KotlinToastManager kotlinToastManager, TimeUtilsContract timeUtilsContract, SystemHelper systemHelper, ChaloAppFeatureHelper chaloAppFeatureHelper, ProfileInputValidator profileInputValidator, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, AnalyticsContract analyticsContract, UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore, BasicInfoContract basicInfoContract) {
        super(componentContext);
        this.k = minProfileUpdateArgs;
        this.l = userProfileDetailsProvider;
        this.m = chaloNavigationManager;
        this.n = permissionHandlerProvider;
        this.o = imagePickerProvider;
        this.p = updateUserProfileUseCase;
        this.q = uploadFileToServerUseCase;
        this.r = stringProvider;
        this.s = kotlinToastManager;
        this.t = timeUtilsContract;
        this.u = systemHelper;
        this.v = chaloAppFeatureHelper;
        this.w = profileInputValidator;
        this.x = minProfileUpdateResultStateManager;
        this.y = analyticsContract;
        this.z = userProfilingHooksRuleEngineDataStore;
        this.A = basicInfoContract;
        W0(MinProfileUpdateIntent.InitializationIntent.f10399a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object F0(MinProfileUpdateComponent minProfileUpdateComponent, UserProfileAppModel userProfileAppModel, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$resolveInitialSequence$1 minProfileUpdateComponent$resolveInitialSequence$1;
        int i;
        boolean z3;
        String strA;
        String strValueOf;
        boolean z4;
        Object obj;
        UserProfileAppModel userProfileAppModel2;
        boolean z5;
        String str;
        boolean z6 = z2;
        ProfileInputValidator profileInputValidator = minProfileUpdateComponent.w;
        if (continuationImpl instanceof MinProfileUpdateComponent$resolveInitialSequence$1) {
            minProfileUpdateComponent$resolveInitialSequence$1 = (MinProfileUpdateComponent$resolveInitialSequence$1) continuationImpl;
            int i2 = minProfileUpdateComponent$resolveInitialSequence$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$resolveInitialSequence$1.label = i2 - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$resolveInitialSequence$1 = new MinProfileUpdateComponent$resolveInitialSequence$1(minProfileUpdateComponent, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$resolveInitialSequence$1 = new MinProfileUpdateComponent$resolveInitialSequence$1(minProfileUpdateComponent, continuationImpl);
        }
        Object obj2 = minProfileUpdateComponent$resolveInitialSequence$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = minProfileUpdateComponent$resolveInitialSequence$1.label;
        if (i3 == 0) {
            ResultKt.b(obj2);
            i = (z6 && StringsKt.F(userProfileAppModel.c)) ? 1 : 0;
            z3 = userProfileAppModel.d == Gender.NULL;
            strA = UserNameUtils.a(userProfileAppModel.f10305a, userProfileAppModel.b);
            boolean zF = StringsKt.F(strA);
            Integer numB = userProfileAppModel.b(minProfileUpdateComponent.u, minProfileUpdateComponent.t);
            if (numB != null) {
                strValueOf = String.valueOf(numB.intValue());
                if (profileInputValidator.a(strValueOf) != null) {
                    strValueOf = null;
                }
            } else {
                strValueOf = null;
            }
            minProfileUpdateComponent$resolveInitialSequence$1.L$0 = userProfileAppModel;
            minProfileUpdateComponent$resolveInitialSequence$1.L$1 = strA;
            minProfileUpdateComponent$resolveInitialSequence$1.L$2 = strValueOf;
            z4 = z;
            minProfileUpdateComponent$resolveInitialSequence$1.Z$0 = z4;
            minProfileUpdateComponent$resolveInitialSequence$1.Z$1 = z6;
            minProfileUpdateComponent$resolveInitialSequence$1.I$0 = i;
            minProfileUpdateComponent$resolveInitialSequence$1.Z$2 = z3;
            minProfileUpdateComponent$resolveInitialSequence$1.Z$3 = zF;
            minProfileUpdateComponent$resolveInitialSequence$1.label = 1;
            Object objY0 = minProfileUpdateComponent.Y0(userProfileAppModel, minProfileUpdateComponent$resolveInitialSequence$1);
            if (objY0 == obj3) {
                return obj3;
            }
            obj = objY0;
            userProfileAppModel2 = userProfileAppModel;
            z5 = zF;
            str = strValueOf;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z5 = minProfileUpdateComponent$resolveInitialSequence$1.Z$3;
            boolean z7 = minProfileUpdateComponent$resolveInitialSequence$1.Z$2;
            int i4 = minProfileUpdateComponent$resolveInitialSequence$1.I$0;
            boolean z8 = minProfileUpdateComponent$resolveInitialSequence$1.Z$1;
            boolean z9 = minProfileUpdateComponent$resolveInitialSequence$1.Z$0;
            str = (String) minProfileUpdateComponent$resolveInitialSequence$1.L$2;
            strA = (String) minProfileUpdateComponent$resolveInitialSequence$1.L$1;
            UserProfileAppModel userProfileAppModel3 = (UserProfileAppModel) minProfileUpdateComponent$resolveInitialSequence$1.L$0;
            ResultKt.b(obj2);
            z4 = z9;
            z3 = z7;
            userProfileAppModel2 = userProfileAppModel3;
            obj = obj2;
            i = i4;
            z6 = z8;
        }
        Long l = (Long) obj;
        boolean z10 = str == null;
        boolean z11 = z4 && (z5 || (l == null));
        boolean z12 = !z4 && z10;
        MinProfileInputState ageInput = new MinProfileInputState.AgeInput(str == null ? "" : str, str != null ? profileInputValidator.a(str) : null, false);
        MinProfileInputState.NameAndDobInput nameAndDobInput = new MinProfileInputState.NameAndDobInput(strA, l, l == null ? ProfileInputValidationError.Age.Empty.f10328a : null, false);
        if (i != 0 && z3 && z11) {
            return CollectionsKt.S(new MinProfileInputState.GenderInput((Gender) null, 3), nameAndDobInput, new MinProfileInputState.ProfilePhotoInput(false));
        }
        if (i != 0 && z3 && z12) {
            return CollectionsKt.S(new MinProfileInputState.GenderInput((Gender) null, 3), ageInput, new MinProfileInputState.ProfilePhotoInput(false));
        }
        if (i != 0 && z3) {
            return CollectionsKt.S(new MinProfileInputState.GenderInput((Gender) null, 3), new MinProfileInputState.ProfilePhotoInput(false));
        }
        if (i != 0 && z11) {
            return CollectionsKt.S(nameAndDobInput, new MinProfileInputState.ProfilePhotoInput(false));
        }
        if (i != 0 && z12) {
            return CollectionsKt.S(ageInput, new MinProfileInputState.ProfilePhotoInput(false));
        }
        if (i != 0) {
            return CollectionsKt.R(new MinProfileInputState.ProfilePhotoInput(false));
        }
        if (z3 && z11) {
            return CollectionsKt.S(new MinProfileInputState.GenderInput((Gender) null, 3), nameAndDobInput);
        }
        if (z3 && z12) {
            return CollectionsKt.S(new MinProfileInputState.GenderInput((Gender) null, 3), ageInput);
        }
        if (z3) {
            return CollectionsKt.R(new MinProfileInputState.GenderInput((Gender) null, 3));
        }
        if (z11) {
            return CollectionsKt.R(nameAndDobInput);
        }
        if (z12) {
            return CollectionsKt.R(ageInput);
        }
        MinProfileInputState.GenderInput genderInput = new MinProfileInputState.GenderInput(userProfileAppModel2.d, 2);
        if (z4) {
            ageInput = nameAndDobInput;
        }
        List listS = CollectionsKt.S(genderInput, ageInput);
        return z6 ? CollectionsKt.d0(new MinProfileInputState.ProfilePhotoInput(false), listS) : listS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0114, code lost:
    
        if (r13 == r1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent.G0(app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static boolean S0(MinProfileInputState minProfileInputState, MinProfileUpdateDataState minProfileUpdateDataState) {
        if (minProfileInputState instanceof MinProfileInputState.ProfilePhotoInput) {
            if (minProfileUpdateDataState.g != null) {
                return true;
            }
            String str = minProfileUpdateDataState.f;
            if (str != null && !StringsKt.F(str)) {
                return true;
            }
            UserProfileAppModel userProfileAppModel = minProfileUpdateDataState.f10390a;
            String str2 = userProfileAppModel != null ? userProfileAppModel.c : null;
            return (str2 == null || StringsKt.F(str2)) ? false : true;
        }
        if (minProfileInputState instanceof MinProfileInputState.GenderInput) {
            return ((MinProfileInputState.GenderInput) minProfileInputState).f10383a != Gender.NULL;
        }
        if (minProfileInputState instanceof MinProfileInputState.AgeInput) {
            MinProfileInputState.AgeInput ageInput = (MinProfileInputState.AgeInput) minProfileInputState;
            return ageInput.b == null && !StringsKt.F(ageInput.f10382a);
        }
        if (!(minProfileInputState instanceof MinProfileInputState.NameAndDobInput)) {
            throw new NoWhenBranchMatchedException();
        }
        MinProfileInputState.NameAndDobInput nameAndDobInput = (MinProfileInputState.NameAndDobInput) minProfileInputState;
        return (StringsKt.F(StringsKt.u0(nameAndDobInput.f10384a).toString()) || nameAndDobInput.c != null || nameAndDobInput.b == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object H0(String str, ProfileInputValidationError.Age age, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$ageInputFieldUIState$1 minProfileUpdateComponent$ageInputFieldUIState$1;
        TextFieldEventHandler textFieldEventHandlerHelper$maxDigits$1;
        UITextStyle uITextStyle;
        UIKeyboardOption uIKeyboardOption;
        String str2;
        ProfileInputValidationError.Age age2;
        int i;
        BaseTextFieldUIState baseTextFieldUIState;
        if (continuationImpl instanceof MinProfileUpdateComponent$ageInputFieldUIState$1) {
            minProfileUpdateComponent$ageInputFieldUIState$1 = (MinProfileUpdateComponent$ageInputFieldUIState$1) continuationImpl;
            int i2 = minProfileUpdateComponent$ageInputFieldUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$ageInputFieldUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$ageInputFieldUIState$1 = new MinProfileUpdateComponent$ageInputFieldUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$ageInputFieldUIState$1 = new MinProfileUpdateComponent$ageInputFieldUIState$1(this, continuationImpl);
        }
        Object objJ0 = minProfileUpdateComponent$ageInputFieldUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = minProfileUpdateComponent$ageInputFieldUIState$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i = minProfileUpdateComponent$ageInputFieldUIState$1.I$0;
                uIKeyboardOption = (UIKeyboardOption) minProfileUpdateComponent$ageInputFieldUIState$1.L$4;
                uITextStyle = (UITextStyle) minProfileUpdateComponent$ageInputFieldUIState$1.L$3;
                textFieldEventHandlerHelper$maxDigits$1 = (TextFieldEventHandler) minProfileUpdateComponent$ageInputFieldUIState$1.L$2;
                age2 = (ProfileInputValidationError.Age) minProfileUpdateComponent$ageInputFieldUIState$1.L$1;
                String str3 = (String) minProfileUpdateComponent$ageInputFieldUIState$1.L$0;
                ResultKt.b(objJ0);
                str2 = str3;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseTextFieldUIState = (BaseTextFieldUIState) minProfileUpdateComponent$ageInputFieldUIState$1.L$0;
                ResultKt.b(objJ0);
            }
            return new AgeInputFieldUIState(baseTextFieldUIState, (TextUIState) objJ0);
        }
        ResultKt.b(objJ0);
        int i4 = (StringsKt.F(str) || age == null) ? 0 : 1;
        textFieldEventHandlerHelper$maxDigits$1 = new TextFieldEventHandlerHelper$maxDigits$1(3, new zi0(this, 0));
        uITextStyle = UITextStyle.BodyLarge;
        uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Number, null, 5);
        str2 = str;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$0 = str2;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$1 = age;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$2 = textFieldEventHandlerHelper$maxDigits$1;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$3 = uITextStyle;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$4 = uIKeyboardOption;
        minProfileUpdateComponent$ageInputFieldUIState$1.I$0 = i4;
        minProfileUpdateComponent$ageInputFieldUIState$1.label = 1;
        Object objB = this.r.b(StringEnum.ENTER_YOUR_AGE, new Object[0], minProfileUpdateComponent$ageInputFieldUIState$1);
        if (objB != obj) {
            age2 = age;
            i = i4;
            objJ0 = objB;
        }
        return obj;
        UIKeyboardOption uIKeyboardOption2 = uIKeyboardOption;
        UITextStyle uITextStyle2 = uITextStyle;
        TextFieldEventHandler textFieldEventHandler = textFieldEventHandlerHelper$maxDigits$1;
        UITextStyle uITextStyle3 = UITextStyle.BodyLarge;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objJ0, uITextStyle3, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandler, uITextStyle2, null, textLabel, null, i != 0, uIKeyboardOption2, 0, null, new UITextFieldColors(black, black, null, shadyGray, shadyGray, shadyGray, transparent, transparent, transparent, transparent, orangePrimary, orangePrimary, 4128868), ChaloThemeHelper.a().p, 31148);
        boolean z = i != 0;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$0 = textFieldUIState;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$1 = null;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$2 = null;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$3 = null;
        minProfileUpdateComponent$ageInputFieldUIState$1.L$4 = null;
        minProfileUpdateComponent$ageInputFieldUIState$1.label = 2;
        objJ0 = J0(age2, z, minProfileUpdateComponent$ageInputFieldUIState$1);
        if (objJ0 != obj) {
            baseTextFieldUIState = textFieldUIState;
            return new AgeInputFieldUIState(baseTextFieldUIState, (TextUIState) objJ0);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I0(MinProfileInputState.AgeInput ageInput, TextUIState.ChaloTextUIState chaloTextUIState, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$ageOnlyStepUIState$1 minProfileUpdateComponent$ageOnlyStepUIState$1;
        Object obj;
        MinProfileInputState.AgeInput ageInput2;
        TextUIState textUIState;
        MinProfileInputState.AgeInput ageInput3;
        TextUIState textUIState2;
        TextUIState textUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState textUIState4;
        TextUIState textUIState5;
        TextUIState textUIState6;
        if (continuationImpl instanceof MinProfileUpdateComponent$ageOnlyStepUIState$1) {
            minProfileUpdateComponent$ageOnlyStepUIState$1 = (MinProfileUpdateComponent$ageOnlyStepUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$ageOnlyStepUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$ageOnlyStepUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$ageOnlyStepUIState$1 = new MinProfileUpdateComponent$ageOnlyStepUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$ageOnlyStepUIState$1 = new MinProfileUpdateComponent$ageOnlyStepUIState$1(this, continuationImpl);
        }
        Object objH0 = minProfileUpdateComponent$ageOnlyStepUIState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$ageOnlyStepUIState$1.label;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        StringProvider stringProvider = this.r;
        if (i2 == 0) {
            ResultKt.b(objH0);
            minProfileUpdateComponent$ageOnlyStepUIState$1.L$0 = ageInput;
            minProfileUpdateComponent$ageOnlyStepUIState$1.L$1 = chaloTextUIState;
            minProfileUpdateComponent$ageOnlyStepUIState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.WHATS_YOUR_AGE, new Object[0], minProfileUpdateComponent$ageOnlyStepUIState$1);
            if (objB != obj2) {
                obj = objB;
                ageInput2 = ageInput;
                textUIState = chaloTextUIState;
            }
            return obj2;
        }
        if (i2 == 1) {
            textUIState = (TextUIState) minProfileUpdateComponent$ageOnlyStepUIState$1.L$1;
            MinProfileInputState.AgeInput ageInput4 = (MinProfileInputState.AgeInput) minProfileUpdateComponent$ageOnlyStepUIState$1.L$0;
            ResultKt.b(objH0);
            obj = objH0;
            ageInput2 = ageInput4;
        } else {
            if (i2 == 2) {
                textUIState3 = (TextUIState) minProfileUpdateComponent$ageOnlyStepUIState$1.L$2;
                TextUIState textUIState7 = (TextUIState) minProfileUpdateComponent$ageOnlyStepUIState$1.L$1;
                ageInput3 = (MinProfileInputState.AgeInput) minProfileUpdateComponent$ageOnlyStepUIState$1.L$0;
                ResultKt.b(objH0);
                textUIState2 = textUIState7;
                MinProfileInputState.AgeInput ageInput5 = ageInput3;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objH0, UITextStyle.HeadlineSmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                String str = ageInput5.f10382a;
                ProfileInputValidationError.Age age = ageInput5.b;
                minProfileUpdateComponent$ageOnlyStepUIState$1.L$0 = textUIState3;
                minProfileUpdateComponent$ageOnlyStepUIState$1.L$1 = chaloTextUIState2;
                minProfileUpdateComponent$ageOnlyStepUIState$1.L$2 = textUIState2;
                minProfileUpdateComponent$ageOnlyStepUIState$1.label = 3;
                objH0 = H0(str, age, minProfileUpdateComponent$ageOnlyStepUIState$1);
                if (objH0 != obj2) {
                    textUIState4 = textUIState2;
                    textUIState5 = textUIState3;
                    textUIState6 = chaloTextUIState2;
                }
                return obj2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState textUIState8 = (TextUIState) minProfileUpdateComponent$ageOnlyStepUIState$1.L$2;
            TextUIState textUIState9 = (TextUIState) minProfileUpdateComponent$ageOnlyStepUIState$1.L$1;
            TextUIState textUIState10 = (TextUIState) minProfileUpdateComponent$ageOnlyStepUIState$1.L$0;
            ResultKt.b(objH0);
            textUIState5 = textUIState10;
            textUIState4 = textUIState8;
            textUIState6 = textUIState9;
        }
        return new MinProfileUpdateStepUIState.AgeStepUIState(textUIState5, textUIState6, textUIState4, null, (AgeInputFieldUIState) objH0, 40);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineSmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        minProfileUpdateComponent$ageOnlyStepUIState$1.L$0 = ageInput2;
        minProfileUpdateComponent$ageOnlyStepUIState$1.L$1 = textUIState;
        minProfileUpdateComponent$ageOnlyStepUIState$1.L$2 = chaloTextUIState3;
        minProfileUpdateComponent$ageOnlyStepUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.WHATS_YOUR_AGE, new Object[0], minProfileUpdateComponent$ageOnlyStepUIState$1);
        if (objB2 != obj2) {
            ageInput3 = ageInput2;
            objH0 = objB2;
            textUIState2 = textUIState;
            textUIState3 = chaloTextUIState3;
            MinProfileInputState.AgeInput ageInput6 = ageInput3;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objH0, UITextStyle.HeadlineSmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            String str2 = ageInput6.f10382a;
            ProfileInputValidationError.Age age2 = ageInput6.b;
            minProfileUpdateComponent$ageOnlyStepUIState$1.L$0 = textUIState3;
            minProfileUpdateComponent$ageOnlyStepUIState$1.L$1 = chaloTextUIState2;
            minProfileUpdateComponent$ageOnlyStepUIState$1.L$2 = textUIState2;
            minProfileUpdateComponent$ageOnlyStepUIState$1.label = 3;
            objH0 = H0(str2, age2, minProfileUpdateComponent$ageOnlyStepUIState$1);
            if (objH0 != obj2) {
                textUIState4 = textUIState2;
                textUIState5 = textUIState3;
                textUIState6 = chaloTextUIState2;
                return new MinProfileUpdateStepUIState.AgeStepUIState(textUIState5, textUIState6, textUIState4, null, (AgeInputFieldUIState) objH0, 40);
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object J0(ProfileInputValidationError.Age age, boolean z, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$ageSupportingTextUIState$1 minProfileUpdateComponent$ageSupportingTextUIState$1;
        if (continuationImpl instanceof MinProfileUpdateComponent$ageSupportingTextUIState$1) {
            minProfileUpdateComponent$ageSupportingTextUIState$1 = (MinProfileUpdateComponent$ageSupportingTextUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$ageSupportingTextUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$ageSupportingTextUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$ageSupportingTextUIState$1 = new MinProfileUpdateComponent$ageSupportingTextUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$ageSupportingTextUIState$1 = new MinProfileUpdateComponent$ageSupportingTextUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$ageSupportingTextUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$ageSupportingTextUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!z || age == null || age.equals(ProfileInputValidationError.Age.Empty.f10328a)) {
                return null;
            }
            if (!age.equals(ProfileInputValidationError.Age.NonNumeric.f10329a) && !age.equals(ProfileInputValidationError.Age.OutOfRange.f10330a)) {
                throw new NoWhenBranchMatchedException();
            }
            minProfileUpdateComponent$ageSupportingTextUIState$1.label = 1;
            objB = this.r.b(StringEnum.ENTER_VALID_AGE, new Object[0], minProfileUpdateComponent$ageSupportingTextUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public final Job K0(MinProfileUpdateResult minProfileUpdateResult) {
        return BuildersKt.d(this.j, null, null, new MinProfileUpdateComponent$closeFlow$1(this, minProfileUpdateResult, null), 3);
    }

    public final LinkedHashMap L0() {
        MinProfileUpdateDataState minProfileUpdateDataState = (MinProfileUpdateDataState) this.f.getValue();
        MinProfileUpdateArgs minProfileUpdateArgs = this.k;
        return MapsKt.k(new Pair("isSkipAllowed", Boolean.valueOf(minProfileUpdateArgs.c)), new Pair("totalInputs", Integer.valueOf(minProfileUpdateDataState.b.size())), new Pair("isLoggedIn", Boolean.valueOf(this.C)), new Pair("appSessionCount", Long.valueOf(this.E)), new Pair("source", minProfileUpdateArgs.d.getSourceName()), new Pair("loginSessionCount", Long.valueOf(this.D)));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object M0(MinProfileUpdateDataState minProfileUpdateDataState, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$confirmationDialogUiState$1 minProfileUpdateComponent$confirmationDialogUiState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        DialogueCtaUiState dialogueCtaUiState;
        DialogueCtaUiState dialogueCtaUiState2;
        if (continuationImpl instanceof MinProfileUpdateComponent$confirmationDialogUiState$1) {
            minProfileUpdateComponent$confirmationDialogUiState$1 = (MinProfileUpdateComponent$confirmationDialogUiState$1) continuationImpl;
            int i = minProfileUpdateComponent$confirmationDialogUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$confirmationDialogUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$confirmationDialogUiState$1 = new MinProfileUpdateComponent$confirmationDialogUiState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$confirmationDialogUiState$1 = new MinProfileUpdateComponent$confirmationDialogUiState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$confirmationDialogUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$confirmationDialogUiState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        StringProvider stringProvider = this.r;
        if (i2 == 0) {
            ResultKt.b(objB);
            MinProfileUpdateDialogType minProfileUpdateDialogType = minProfileUpdateDataState.h;
            if (Intrinsics.d(minProfileUpdateDialogType, MinProfileUpdateDialogType.GalleryPermissionRationale.f10392a)) {
                minProfileUpdateComponent$confirmationDialogUiState$1.label = 1;
                objB = stringProvider.b(StringEnum.CAMERA_PROFILE_PICTURE_UPDATE_PROMPT, new Object[0], minProfileUpdateComponent$confirmationDialogUiState$1);
                if (objB != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if ((minProfileUpdateDialogType instanceof MinProfileUpdateDialogType.DobPicker) || minProfileUpdateDialogType == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) minProfileUpdateComponent$confirmationDialogUiState$1.L$0;
                ResultKt.b(objB);
                dialogueCtaUiState = new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new bj0(this, 6)));
                minProfileUpdateComponent$confirmationDialogUiState$1.L$0 = chaloTextUIState;
                minProfileUpdateComponent$confirmationDialogUiState$1.L$1 = dialogueCtaUiState;
                minProfileUpdateComponent$confirmationDialogUiState$1.label = 3;
                objB = stringProvider.b(StringEnum.CANCEL, new Object[0], minProfileUpdateComponent$confirmationDialogUiState$1);
                if (objB != coroutineSingletons) {
                    dialogueCtaUiState2 = dialogueCtaUiState;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogueCtaUiState2 = (DialogueCtaUiState) minProfileUpdateComponent$confirmationDialogUiState$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) minProfileUpdateComponent$confirmationDialogUiState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
        }
        return new ConfirmationDialogUiState(null, chaloTextUIState, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new bj0(this, 7))), 1), null, 19);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        minProfileUpdateComponent$confirmationDialogUiState$1.L$0 = chaloTextUIState3;
        minProfileUpdateComponent$confirmationDialogUiState$1.label = 2;
        objB = stringProvider.b(StringEnum.SETTINGS, new Object[0], minProfileUpdateComponent$confirmationDialogUiState$1);
        if (objB != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState3;
            dialogueCtaUiState = new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new bj0(this, 6)));
            minProfileUpdateComponent$confirmationDialogUiState$1.L$0 = chaloTextUIState;
            minProfileUpdateComponent$confirmationDialogUiState$1.L$1 = dialogueCtaUiState;
            minProfileUpdateComponent$confirmationDialogUiState$1.label = 3;
            objB = stringProvider.b(StringEnum.CANCEL, new Object[0], minProfileUpdateComponent$confirmationDialogUiState$1);
            if (objB != coroutineSingletons) {
                dialogueCtaUiState2 = dialogueCtaUiState;
                return new ConfirmationDialogUiState(null, chaloTextUIState, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new bj0(this, 7))), 1), null, 19);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x013a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0158  */
    /* JADX WARN: Code duplicated, block: B:29:0x015b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0164  */
    /* JADX WARN: Code duplicated, block: B:32:0x0166  */
    /* JADX WARN: Code duplicated, block: B:35:0x0191  */
    /* JADX WARN: Code duplicated, block: B:38:0x0198  */
    /* JADX WARN: Code duplicated, block: B:39:0x019b  */
    /* JADX WARN: Code duplicated, block: B:41:0x019f  */
    /* JADX WARN: Code duplicated, block: B:44:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01df  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0211  */
    /* JADX WARN: Code duplicated, block: B:73:0x0220  */
    /* JADX WARN: Code duplicated, block: B:76:0x0243  */
    /* JADX WARN: Code duplicated, block: B:79:0x0254  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0270  */
    /* JADX WARN: Code duplicated, block: B:86:0x0282  */
    /* JADX WARN: Code duplicated, block: B:89:0x028d  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
    
        if (r1 == r3) goto L82;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent.p0(app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object O0(Long l, ProfileInputValidationError.Age age, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$dobInputFieldUIState$1 minProfileUpdateComponent$dobInputFieldUIState$1;
        int i;
        String str;
        UiEventHandler uiEventHandlerA;
        UITextStyle uITextStyle;
        ProfileInputValidationError.Age age2;
        int i2;
        BaseTextFieldUIState baseTextFieldUIState;
        if (continuationImpl instanceof MinProfileUpdateComponent$dobInputFieldUIState$1) {
            minProfileUpdateComponent$dobInputFieldUIState$1 = (MinProfileUpdateComponent$dobInputFieldUIState$1) continuationImpl;
            int i3 = minProfileUpdateComponent$dobInputFieldUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$dobInputFieldUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$dobInputFieldUIState$1 = new MinProfileUpdateComponent$dobInputFieldUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$dobInputFieldUIState$1 = new MinProfileUpdateComponent$dobInputFieldUIState$1(this, continuationImpl);
        }
        Object objJ0 = minProfileUpdateComponent$dobInputFieldUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = minProfileUpdateComponent$dobInputFieldUIState$1.label;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = minProfileUpdateComponent$dobInputFieldUIState$1.I$0;
                uITextStyle = (UITextStyle) minProfileUpdateComponent$dobInputFieldUIState$1.L$3;
                uiEventHandlerA = (UiEventHandler) minProfileUpdateComponent$dobInputFieldUIState$1.L$2;
                str = (String) minProfileUpdateComponent$dobInputFieldUIState$1.L$1;
                age2 = (ProfileInputValidationError.Age) minProfileUpdateComponent$dobInputFieldUIState$1.L$0;
                ResultKt.b(objJ0);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseTextFieldUIState = (BaseTextFieldUIState) minProfileUpdateComponent$dobInputFieldUIState$1.L$0;
                ResultKt.b(objJ0);
            }
            return new AgeInputFieldUIState(baseTextFieldUIState, (TextUIState) objJ0);
        }
        ResultKt.b(objJ0);
        if (age == null || age.equals(ProfileInputValidationError.Age.Empty.f10328a)) {
            i = 0;
        } else {
            if (!age.equals(ProfileInputValidationError.Age.NonNumeric.f10329a) && !age.equals(ProfileInputValidationError.Age.OutOfRange.f10330a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        String strQ = l != null ? this.t.Q(l.longValue()) : null;
        if (strQ == null) {
            strQ = "";
        }
        str = strQ;
        uiEventHandlerA = UiEventHandler.Companion.a(new bj0(this, 1));
        uITextStyle = UITextStyle.BodyLarge;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$0 = age;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$1 = str;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$2 = uiEventHandlerA;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$3 = uITextStyle;
        minProfileUpdateComponent$dobInputFieldUIState$1.I$0 = i;
        minProfileUpdateComponent$dobInputFieldUIState$1.label = 1;
        Object objB = this.r.b(StringEnum.DOB_PLACEHOLDER, new Object[0], minProfileUpdateComponent$dobInputFieldUIState$1);
        if (objB != obj) {
            age2 = age;
            i2 = i;
            objJ0 = objB;
        }
        return obj;
        UITextStyle uITextStyle2 = uITextStyle;
        UiEventHandler uiEventHandler = uiEventHandlerA;
        String str2 = str;
        UITextStyle uITextStyle3 = UITextStyle.BodyLarge;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) objJ0, uITextStyle3, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        ImageUIState imageUIState = new ImageUIState(IconType.IC_CALENDAR_MONTH_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new bj0(this, 2)), WebSocketProtocol.PAYLOAD_SHORT);
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        BaseTextFieldUIState.ClickableTextFieldUIState clickableTextFieldUIState = new BaseTextFieldUIState.ClickableTextFieldUIState(str2, uiEventHandler, uITextStyle2, null, textLabel, imageUIState, i2 != 0, null, null, new UITextFieldColors(black, black, null, shadyGray, shadyGray, shadyGray, transparent, transparent, transparent, transparent, orangePrimary, orangePrimary, 4128868), ChaloThemeHelper.a().p, 40744);
        boolean z = i2 != 0;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$0 = clickableTextFieldUIState;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$1 = null;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$2 = null;
        minProfileUpdateComponent$dobInputFieldUIState$1.L$3 = null;
        minProfileUpdateComponent$dobInputFieldUIState$1.label = 2;
        objJ0 = J0(age2, z, minProfileUpdateComponent$dobInputFieldUIState$1);
        if (objJ0 != obj) {
            baseTextFieldUIState = clickableTextFieldUIState;
            return new AgeInputFieldUIState(baseTextFieldUIState, (TextUIState) objJ0);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P0(ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$dobSelectableDates$1 minProfileUpdateComponent$dobSelectableDates$1;
        String timezoneId;
        UserProfileDobPickerHelper userProfileDobPickerHelper;
        if (continuationImpl instanceof MinProfileUpdateComponent$dobSelectableDates$1) {
            minProfileUpdateComponent$dobSelectableDates$1 = (MinProfileUpdateComponent$dobSelectableDates$1) continuationImpl;
            int i = minProfileUpdateComponent$dobSelectableDates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$dobSelectableDates$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$dobSelectableDates$1 = new MinProfileUpdateComponent$dobSelectableDates$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$dobSelectableDates$1 = new MinProfileUpdateComponent$dobSelectableDates$1(this, continuationImpl);
        }
        Object obj = minProfileUpdateComponent$dobSelectableDates$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$dobSelectableDates$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strB = this.t.b();
            UserProfileDobPickerHelper userProfileDobPickerHelper2 = UserProfileDobPickerHelper.f10412a;
            minProfileUpdateComponent$dobSelectableDates$1.L$0 = userProfileDobPickerHelper2;
            minProfileUpdateComponent$dobSelectableDates$1.L$1 = strB;
            minProfileUpdateComponent$dobSelectableDates$1.label = 1;
            Object objC = this.A.c(minProfileUpdateComponent$dobSelectableDates$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            timezoneId = strB;
            obj = objC;
            userProfileDobPickerHelper = userProfileDobPickerHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) minProfileUpdateComponent$dobSelectableDates$1.L$1;
            userProfileDobPickerHelper = (UserProfileDobPickerHelper) minProfileUpdateComponent$dobSelectableDates$1.L$0;
            ResultKt.b(obj);
            timezoneId = str;
        }
        long jLongValue = ((Number) obj).longValue();
        userProfileDobPickerHelper.getClass();
        Intrinsics.i(timezoneId, "timezoneId");
        DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
        PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
        Intrinsics.i(datePickerDefaults, "<this>");
        return new ChaloDatePickerKt$betweenRange$1(jLongValue - 3153600000000L, jLongValue, timezoneId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object Q0(Gender gender, boolean z, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$genderOptionCardUIState$1 minProfileUpdateComponent$genderOptionCardUIState$1;
        StringEnum stringEnum;
        boolean z2;
        IconType iconType;
        Gender gender2 = gender;
        if (continuationImpl instanceof MinProfileUpdateComponent$genderOptionCardUIState$1) {
            minProfileUpdateComponent$genderOptionCardUIState$1 = (MinProfileUpdateComponent$genderOptionCardUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$genderOptionCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$genderOptionCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$genderOptionCardUIState$1 = new MinProfileUpdateComponent$genderOptionCardUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$genderOptionCardUIState$1 = new MinProfileUpdateComponent$genderOptionCardUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$genderOptionCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$genderOptionCardUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(gender2, "<this>");
            int i3 = GenderKt.WhenMappings.f10303a[gender2.ordinal()];
            if (i3 == 1) {
                stringEnum = StringEnum.MALE;
            } else if (i3 == 2) {
                stringEnum = StringEnum.FEMALE;
            } else if (i3 == 3) {
                stringEnum = StringEnum.THIRD_GENDER_NEXT_LINE;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                stringEnum = StringEnum.NOT_SET;
            }
            minProfileUpdateComponent$genderOptionCardUIState$1.L$0 = gender2;
            minProfileUpdateComponent$genderOptionCardUIState$1.Z$0 = z;
            minProfileUpdateComponent$genderOptionCardUIState$1.label = 1;
            objB = this.r.b(stringEnum, new Object[0], minProfileUpdateComponent$genderOptionCardUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = minProfileUpdateComponent$genderOptionCardUIState$1.Z$0;
            Gender gender3 = (Gender) minProfileUpdateComponent$genderOptionCardUIState$1.L$0;
            ResultKt.b(objB);
            z2 = z3;
            gender2 = gender3;
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.Black.f9759a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        int i4 = WhenMappings.f10386a[gender2.ordinal()];
        if (i4 == 1) {
            iconType = IconType.IC_USER_MALE;
        } else if (i4 == 2) {
            iconType = IconType.IC_USER_FEMALE;
        } else if (i4 == 3) {
            iconType = IconType.IC_TRANSGENDER_SYMBOL;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.IC_USER_MALE;
        }
        return new GenderOptionCardUIState(chaloTextUIState, new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.Fit, 0.0f, (UiEventHandler) null, 238), z2, z2 ? ChaloColorToken.CornSilk.f9778a : ChaloColorToken.White.f9870a, new BorderUISpec(ChaloThemeHelper.a().b, z2 ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.LightGray.f9814a, UIShape.e), UiEventHandler.Companion.a(new zf0(6, this, gender2)));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e1 -> B:31:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object R0(app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState.GenderInput r26, java.util.List r27, app.chalo.uistate.text.TextUIState.ChaloTextUIState r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent.R0(app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState$GenderInput, java.util.List, app.chalo.uistate.text.TextUIState$ChaloTextUIState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x012a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object T0(MinProfileInputState.NameAndDobInput nameAndDobInput, TextUIState.ChaloTextUIState chaloTextUIState, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$nameAndDobStepUIState$1 minProfileUpdateComponent$nameAndDobStepUIState$1;
        Object obj;
        MinProfileInputState.NameAndDobInput nameAndDobInput2;
        TextUIState textUIState;
        MinProfileInputState.NameAndDobInput nameAndDobInput3;
        TextUIState textUIState2;
        TextUIState textUIState3;
        TextUIState chaloTextUIState2;
        MinProfileInputState.NameAndDobInput nameAndDobInput4;
        MinProfileUpdateComponent minProfileUpdateComponent;
        Object objU0;
        MinProfileInputState.NameAndDobInput nameAndDobInput5;
        AgeInputFieldUIState ageInputFieldUIState;
        Object objO0;
        TextUIState textUIState4;
        AgeInputFieldUIState ageInputFieldUIState2;
        TextUIState textUIState5;
        if (continuationImpl instanceof MinProfileUpdateComponent$nameAndDobStepUIState$1) {
            minProfileUpdateComponent$nameAndDobStepUIState$1 = (MinProfileUpdateComponent$nameAndDobStepUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$nameAndDobStepUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$nameAndDobStepUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$nameAndDobStepUIState$1 = new MinProfileUpdateComponent$nameAndDobStepUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$nameAndDobStepUIState$1 = new MinProfileUpdateComponent$nameAndDobStepUIState$1(this, continuationImpl);
        }
        Object obj2 = minProfileUpdateComponent$nameAndDobStepUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$nameAndDobStepUIState$1.label;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        StringProvider stringProvider = this.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = nameAndDobInput;
            minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = chaloTextUIState;
            minProfileUpdateComponent$nameAndDobStepUIState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.WHAT_IS_YOUR_NAME, new Object[0], minProfileUpdateComponent$nameAndDobStepUIState$1);
            if (objB != coroutineSingletons) {
                obj = objB;
                nameAndDobInput2 = nameAndDobInput;
                textUIState = chaloTextUIState;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            textUIState = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$1;
            MinProfileInputState.NameAndDobInput nameAndDobInput6 = (MinProfileInputState.NameAndDobInput) minProfileUpdateComponent$nameAndDobStepUIState$1.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            nameAndDobInput2 = nameAndDobInput6;
        } else {
            if (i2 == 2) {
                textUIState3 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$2;
                TextUIState textUIState6 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$1;
                nameAndDobInput3 = (MinProfileInputState.NameAndDobInput) minProfileUpdateComponent$nameAndDobStepUIState$1.L$0;
                ResultKt.b(obj2);
                textUIState2 = textUIState6;
                nameAndDobInput4 = nameAndDobInput3;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.HeadlineSmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = nameAndDobInput4;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = textUIState3;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$2 = chaloTextUIState2;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$3 = textUIState2;
                minProfileUpdateComponent$nameAndDobStepUIState$1.label = 3;
                minProfileUpdateComponent = this;
                objU0 = minProfileUpdateComponent.U0(nameAndDobInput4, minProfileUpdateComponent$nameAndDobStepUIState$1);
                if (objU0 != coroutineSingletons) {
                    nameAndDobInput5 = nameAndDobInput4;
                    obj2 = objU0;
                    ageInputFieldUIState = (AgeInputFieldUIState) obj2;
                    Long l = nameAndDobInput5.b;
                    ProfileInputValidationError.Age age = nameAndDobInput5.c;
                    minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = textUIState3;
                    minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = chaloTextUIState2;
                    minProfileUpdateComponent$nameAndDobStepUIState$1.L$2 = textUIState2;
                    minProfileUpdateComponent$nameAndDobStepUIState$1.L$3 = ageInputFieldUIState;
                    minProfileUpdateComponent$nameAndDobStepUIState$1.label = 4;
                    objO0 = minProfileUpdateComponent.O0(l, age, minProfileUpdateComponent$nameAndDobStepUIState$1);
                    if (objO0 != coroutineSingletons) {
                        textUIState4 = textUIState2;
                        ageInputFieldUIState2 = ageInputFieldUIState;
                        obj2 = objO0;
                        textUIState5 = textUIState3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                TextUIState textUIState7 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$3;
                chaloTextUIState2 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$2;
                TextUIState textUIState8 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$1;
                nameAndDobInput5 = (MinProfileInputState.NameAndDobInput) minProfileUpdateComponent$nameAndDobStepUIState$1.L$0;
                ResultKt.b(obj2);
                minProfileUpdateComponent = this;
                textUIState2 = textUIState7;
                textUIState3 = textUIState8;
                ageInputFieldUIState = (AgeInputFieldUIState) obj2;
                Long l2 = nameAndDobInput5.b;
                ProfileInputValidationError.Age age2 = nameAndDobInput5.c;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = textUIState3;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = chaloTextUIState2;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$2 = textUIState2;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$3 = ageInputFieldUIState;
                minProfileUpdateComponent$nameAndDobStepUIState$1.label = 4;
                objO0 = minProfileUpdateComponent.O0(l2, age2, minProfileUpdateComponent$nameAndDobStepUIState$1);
                if (objO0 != coroutineSingletons) {
                    textUIState4 = textUIState2;
                    ageInputFieldUIState2 = ageInputFieldUIState;
                    obj2 = objO0;
                    textUIState5 = textUIState3;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AgeInputFieldUIState ageInputFieldUIState3 = (AgeInputFieldUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$3;
            TextUIState textUIState9 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$2;
            chaloTextUIState2 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$1;
            TextUIState textUIState10 = (TextUIState) minProfileUpdateComponent$nameAndDobStepUIState$1.L$0;
            ResultKt.b(obj2);
            textUIState5 = textUIState10;
            ageInputFieldUIState2 = ageInputFieldUIState3;
            textUIState4 = textUIState9;
        }
        return new MinProfileUpdateStepUIState.AgeStepUIState(textUIState5, chaloTextUIState2, textUIState4, ageInputFieldUIState2, (AgeInputFieldUIState) obj2, 32);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineSmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = nameAndDobInput2;
        minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = textUIState;
        minProfileUpdateComponent$nameAndDobStepUIState$1.L$2 = chaloTextUIState3;
        minProfileUpdateComponent$nameAndDobStepUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.DATE_OF_BIRTH, new Object[0], minProfileUpdateComponent$nameAndDobStepUIState$1);
        if (objB2 != coroutineSingletons) {
            nameAndDobInput3 = nameAndDobInput2;
            obj2 = objB2;
            textUIState2 = textUIState;
            textUIState3 = chaloTextUIState3;
            nameAndDobInput4 = nameAndDobInput3;
            chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.HeadlineSmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = nameAndDobInput4;
            minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = textUIState3;
            minProfileUpdateComponent$nameAndDobStepUIState$1.L$2 = chaloTextUIState2;
            minProfileUpdateComponent$nameAndDobStepUIState$1.L$3 = textUIState2;
            minProfileUpdateComponent$nameAndDobStepUIState$1.label = 3;
            minProfileUpdateComponent = this;
            objU0 = minProfileUpdateComponent.U0(nameAndDobInput4, minProfileUpdateComponent$nameAndDobStepUIState$1);
            if (objU0 != coroutineSingletons) {
                nameAndDobInput5 = nameAndDobInput4;
                obj2 = objU0;
                ageInputFieldUIState = (AgeInputFieldUIState) obj2;
                Long l3 = nameAndDobInput5.b;
                ProfileInputValidationError.Age age3 = nameAndDobInput5.c;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$0 = textUIState3;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$1 = chaloTextUIState2;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$2 = textUIState2;
                minProfileUpdateComponent$nameAndDobStepUIState$1.L$3 = ageInputFieldUIState;
                minProfileUpdateComponent$nameAndDobStepUIState$1.label = 4;
                objO0 = minProfileUpdateComponent.O0(l3, age3, minProfileUpdateComponent$nameAndDobStepUIState$1);
                if (objO0 != coroutineSingletons) {
                    textUIState4 = textUIState2;
                    ageInputFieldUIState2 = ageInputFieldUIState;
                    obj2 = objO0;
                    textUIState5 = textUIState3;
                    return new MinProfileUpdateStepUIState.AgeStepUIState(textUIState5, chaloTextUIState2, textUIState4, ageInputFieldUIState2, (AgeInputFieldUIState) obj2, 32);
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object U0(MinProfileInputState.NameAndDobInput nameAndDobInput, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$nameInputFieldUIState$1 minProfileUpdateComponent$nameInputFieldUIState$1;
        UITextStyle uITextStyle;
        UIKeyboardOption uIKeyboardOption;
        String str;
        TextFieldEventHandler textFieldEventHandler;
        if (continuationImpl instanceof MinProfileUpdateComponent$nameInputFieldUIState$1) {
            minProfileUpdateComponent$nameInputFieldUIState$1 = (MinProfileUpdateComponent$nameInputFieldUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$nameInputFieldUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$nameInputFieldUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$nameInputFieldUIState$1 = new MinProfileUpdateComponent$nameInputFieldUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$nameInputFieldUIState$1 = new MinProfileUpdateComponent$nameInputFieldUIState$1(this, continuationImpl);
        }
        Object obj = minProfileUpdateComponent$nameInputFieldUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$nameInputFieldUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str2 = nameAndDobInput.f10384a;
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new zi0(this, 1), null);
            UITextStyle uITextStyle2 = UITextStyle.BodyLarge;
            UIKeyboardOption uIKeyboardOption2 = new UIKeyboardOption(null, null, null, 7);
            minProfileUpdateComponent$nameInputFieldUIState$1.L$0 = str2;
            minProfileUpdateComponent$nameInputFieldUIState$1.L$1 = textFieldEventHandlerHelper$basic$3B;
            minProfileUpdateComponent$nameInputFieldUIState$1.L$2 = uITextStyle2;
            minProfileUpdateComponent$nameInputFieldUIState$1.L$3 = uIKeyboardOption2;
            minProfileUpdateComponent$nameInputFieldUIState$1.label = 1;
            Object objB = this.r.b(StringEnum.USER_PROFILE_FORM_NAME_PLACEHOLDER, new Object[0], minProfileUpdateComponent$nameInputFieldUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            uITextStyle = uITextStyle2;
            uIKeyboardOption = uIKeyboardOption2;
            str = str2;
            obj = objB;
            textFieldEventHandler = textFieldEventHandlerHelper$basic$3B;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UIKeyboardOption uIKeyboardOption3 = (UIKeyboardOption) minProfileUpdateComponent$nameInputFieldUIState$1.L$3;
            UITextStyle uITextStyle3 = (UITextStyle) minProfileUpdateComponent$nameInputFieldUIState$1.L$2;
            TextFieldEventHandler textFieldEventHandler2 = (TextFieldEventHandler) minProfileUpdateComponent$nameInputFieldUIState$1.L$1;
            String str3 = (String) minProfileUpdateComponent$nameInputFieldUIState$1.L$0;
            ResultKt.b(obj);
            str = str3;
            uIKeyboardOption = uIKeyboardOption3;
            uITextStyle = uITextStyle3;
            textFieldEventHandler = textFieldEventHandler2;
        }
        UITextStyle uITextStyle4 = UITextStyle.BodyLarge;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        TextFieldLabelPlaceholderUIState.TextLabel textLabel = new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, uITextStyle4, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        return new AgeInputFieldUIState(new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandler, uITextStyle, null, textLabel, null, false, uIKeyboardOption, 0, null, new UITextFieldColors(black, black, null, shadyGray, shadyGray, shadyGray, transparent, transparent, transparent, transparent, orangePrimary, orangePrimary, 4128868), ChaloThemeHelper.a().p, 31148), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(MinProfileUpdateDataState minProfileUpdateDataState, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$nextButtonUIState$1 minProfileUpdateComponent$nextButtonUIState$1;
        int i;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof MinProfileUpdateComponent$nextButtonUIState$1) {
            minProfileUpdateComponent$nextButtonUIState$1 = (MinProfileUpdateComponent$nextButtonUIState$1) continuationImpl;
            int i2 = minProfileUpdateComponent$nextButtonUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$nextButtonUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$nextButtonUIState$1 = new MinProfileUpdateComponent$nextButtonUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$nextButtonUIState$1 = new MinProfileUpdateComponent$nextButtonUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$nextButtonUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = minProfileUpdateComponent$nextButtonUIState$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            MinProfileInputState minProfileInputState = (MinProfileInputState) CollectionsKt.L(minProfileUpdateDataState.d, minProfileUpdateDataState.b);
            i = (minProfileUpdateDataState.e || minProfileInputState == null || !S0(minProfileInputState, minProfileUpdateDataState)) ? 0 : 1;
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            minProfileUpdateComponent$nextButtonUIState$1.L$0 = buttonUIStateFactory;
            minProfileUpdateComponent$nextButtonUIState$1.I$0 = i;
            minProfileUpdateComponent$nextButtonUIState$1.label = 1;
            objB = this.r.b(StringEnum.NEXT, new Object[0], minProfileUpdateComponent$nextButtonUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = minProfileUpdateComponent$nextButtonUIState$1.I$0;
            ButtonUIStateFactory buttonUIStateFactory2 = (ButtonUIStateFactory) minProfileUpdateComponent$nextButtonUIState$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory2;
        }
        return ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new bj0(this, 5), null, UIShape.e, i != 0, 0.0f, 36);
    }

    public final void W0(MinProfileUpdateIntent minProfileUpdateIntent) {
        MinProfileInputState minProfileInputState;
        MinProfileInputState minProfileInputState2;
        MinProfileInputState minProfileInputStateB;
        List list;
        MinProfileInputState minProfileInputStateB2;
        C0(minProfileUpdateIntent);
        boolean zEquals = minProfileUpdateIntent.equals(MinProfileUpdateIntent.InitializationIntent.f10399a);
        boolean z = true;
        ContextScope contextScope = this.j;
        if (zEquals) {
            if (this.d) {
                return;
            }
            this.d = true;
            BuildersKt.d(contextScope, null, null, new MinProfileUpdateComponent$handleInitializationIntent$1(this, null), 3);
            return;
        }
        boolean zEquals2 = minProfileUpdateIntent.equals(MinProfileUpdateIntent.BackClicked.f10394a);
        StateFlow stateFlow = this.f;
        if (zEquals2) {
            MinProfileUpdateDataState minProfileUpdateDataState = (MinProfileUpdateDataState) stateFlow.getValue();
            int i = minProfileUpdateDataState.d;
            List list2 = minProfileUpdateDataState.b;
            if (i <= 0) {
                K0(MinProfileUpdateResult.Dismissed.f9057a);
                return;
            }
            int i2 = i - 1;
            MinProfileInputState minProfileInputState3 = (MinProfileInputState) CollectionsKt.L(i2, list2);
            if (minProfileInputState3 != null && minProfileInputState3.getF10385a() && S0(minProfileInputState3, minProfileUpdateDataState)) {
                ArrayList arrayListE0 = CollectionsKt.E0(list2);
                if (minProfileInputState3 instanceof MinProfileInputState.ProfilePhotoInput) {
                    list = list2;
                    list = list2;
                    list = list2;
                    minProfileInputStateB2 = new MinProfileInputState.ProfilePhotoInput(false);
                } else if (minProfileInputState3 instanceof MinProfileInputState.GenderInput) {
                    list = list2;
                    list = list2;
                    list = list2;
                    Gender selectedGender = ((MinProfileInputState.GenderInput) minProfileInputState3).f10383a;
                    Intrinsics.i(selectedGender, "selectedGender");
                    minProfileInputStateB2 = new MinProfileInputState.GenderInput(selectedGender, false);
                } else if (minProfileInputState3 instanceof MinProfileInputState.AgeInput) {
                    list = list2;
                    list = list2;
                    list = list2;
                    minProfileInputStateB2 = MinProfileInputState.AgeInput.b((MinProfileInputState.AgeInput) minProfileInputState3, false);
                } else {
                    if (!(minProfileInputState3 instanceof MinProfileInputState.NameAndDobInput)) {
                        list = list2;
                        list = list2;
                        list = list2;
                        throw new NoWhenBranchMatchedException();
                    }
                    list = list2;
                    list = list2;
                    list = list2;
                    minProfileInputStateB2 = MinProfileInputState.NameAndDobInput.b((MinProfileInputState.NameAndDobInput) minProfileInputState3, null, null, null, false, 7);
                }
                arrayListE0.set(i2, minProfileInputStateB2);
                list = arrayListE0;
            }
            list = list2;
            list = list2;
            list = list2;
            list = list2;
            list = list2;
            list = list2;
            E0(new dj0(list, i2, 0));
            return;
        }
        if (minProfileUpdateIntent instanceof MinProfileUpdateIntent.GenderSelected) {
            MinProfileUpdateIntent.GenderSelected genderSelected = (MinProfileUpdateIntent.GenderSelected) minProfileUpdateIntent;
            int i3 = ((MinProfileUpdateDataState) stateFlow.getValue()).d;
            List list3 = ((MinProfileUpdateDataState) stateFlow.getValue()).b;
            MinProfileInputState minProfileInputState4 = (MinProfileInputState) CollectionsKt.L(i3, list3);
            if (minProfileInputState4 != null && (minProfileInputState4 instanceof MinProfileInputState.GenderInput)) {
                ArrayList arrayListE1 = CollectionsKt.E0(list3);
                arrayListE1.set(i3, new MinProfileInputState.GenderInput(genderSelected.f10398a, false));
                E0(new qd(7, arrayListE1));
                return;
            }
            return;
        }
        if (minProfileUpdateIntent instanceof MinProfileUpdateIntent.NameEntered) {
            MinProfileUpdateIntent.NameEntered nameEntered = (MinProfileUpdateIntent.NameEntered) minProfileUpdateIntent;
            int i4 = ((MinProfileUpdateDataState) stateFlow.getValue()).d;
            List list4 = ((MinProfileUpdateDataState) stateFlow.getValue()).b;
            MinProfileInputState minProfileInputState5 = (MinProfileInputState) CollectionsKt.L(i4, list4);
            if (minProfileInputState5 != null && (minProfileInputState5 instanceof MinProfileInputState.NameAndDobInput)) {
                ArrayList arrayListE2 = CollectionsKt.E0(list4);
                arrayListE2.set(i4, MinProfileInputState.NameAndDobInput.b((MinProfileInputState.NameAndDobInput) minProfileInputState5, nameEntered.f10400a, null, null, false, 6));
                E0(new qd(8, arrayListE2));
                return;
            }
            return;
        }
        if (minProfileUpdateIntent instanceof MinProfileUpdateIntent.AgeTextChanged) {
            MinProfileUpdateIntent.AgeTextChanged ageTextChanged = (MinProfileUpdateIntent.AgeTextChanged) minProfileUpdateIntent;
            int i5 = ((MinProfileUpdateDataState) stateFlow.getValue()).d;
            List list5 = ((MinProfileUpdateDataState) stateFlow.getValue()).b;
            MinProfileInputState minProfileInputState6 = (MinProfileInputState) CollectionsKt.L(i5, list5);
            if (minProfileInputState6 != null && (minProfileInputState6 instanceof MinProfileInputState.AgeInput)) {
                ArrayList arrayListE3 = CollectionsKt.E0(list5);
                String str = ageTextChanged.f10393a;
                arrayListE3.set(i5, new MinProfileInputState.AgeInput(str, this.w.a(str), false));
                E0(new qd(6, arrayListE3));
                return;
            }
            return;
        }
        if (minProfileUpdateIntent.equals(MinProfileUpdateIntent.DobFieldClicked.f10395a)) {
            BuildersKt.d(contextScope, null, null, new MinProfileUpdateComponent$handleDobFieldClickedIntent$1(this, null), 3);
            return;
        }
        if (minProfileUpdateIntent instanceof MinProfileUpdateIntent.DobSelected) {
            MinProfileUpdateIntent.DobSelected dobSelected = (MinProfileUpdateIntent.DobSelected) minProfileUpdateIntent;
            int i6 = ((MinProfileUpdateDataState) stateFlow.getValue()).d;
            List list6 = ((MinProfileUpdateDataState) stateFlow.getValue()).b;
            MinProfileInputState minProfileInputState7 = (MinProfileInputState) CollectionsKt.L(i6, list6);
            if (minProfileInputState7 != null && (minProfileInputState7 instanceof MinProfileInputState.NameAndDobInput)) {
                ArrayList arrayListE4 = CollectionsKt.E0(list6);
                MinProfileInputState.NameAndDobInput nameAndDobInput = (MinProfileInputState.NameAndDobInput) minProfileInputState7;
                Long l = dobSelected.f10397a;
                arrayListE4.set(i6, MinProfileInputState.NameAndDobInput.b(nameAndDobInput, null, l, l == null ? ProfileInputValidationError.Age.Empty.f10328a : null, false, 1));
                E0(new qd(9, arrayListE4));
                return;
            }
            return;
        }
        if (minProfileUpdateIntent.equals(MinProfileUpdateIntent.DobPickerDismissed.f10396a)) {
            E0(new qi0(25));
            return;
        }
        boolean zEquals3 = minProfileUpdateIntent.equals(MinProfileUpdateIntent.SkipClicked.f10404a);
        MinProfileUpdateResult.Skipped skipped = MinProfileUpdateResult.Skipped.f9059a;
        if (zEquals3) {
            if (this.k.c) {
                final MinProfileUpdateDataState minProfileUpdateDataState2 = (MinProfileUpdateDataState) stateFlow.getValue();
                boolean z2 = minProfileUpdateDataState2.e;
                List list7 = minProfileUpdateDataState2.b;
                int i7 = minProfileUpdateDataState2.d;
                if (z2 || (minProfileInputState2 = (MinProfileInputState) CollectionsKt.L(i7, list7)) == null) {
                    return;
                }
                ArrayList arrayListE5 = CollectionsKt.E0(list7);
                if (minProfileInputState2 instanceof MinProfileInputState.ProfilePhotoInput) {
                    minProfileInputStateB = new MinProfileInputState.ProfilePhotoInput(true);
                } else if (minProfileInputState2 instanceof MinProfileInputState.GenderInput) {
                    Gender selectedGender2 = ((MinProfileInputState.GenderInput) minProfileInputState2).f10383a;
                    Intrinsics.i(selectedGender2, "selectedGender");
                    minProfileInputStateB = new MinProfileInputState.GenderInput(selectedGender2, true);
                } else if (minProfileInputState2 instanceof MinProfileInputState.AgeInput) {
                    minProfileInputStateB = MinProfileInputState.AgeInput.b((MinProfileInputState.AgeInput) minProfileInputState2, true);
                } else {
                    if (!(minProfileInputState2 instanceof MinProfileInputState.NameAndDobInput)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    minProfileInputStateB = MinProfileInputState.NameAndDobInput.b((MinProfileInputState.NameAndDobInput) minProfileInputState2, null, null, null, true, 7);
                }
                arrayListE5.set(i7, minProfileInputStateB);
                E0(new ej0(0, minProfileInputState2, arrayListE5));
                BuildersKt.d(contextScope, null, null, new MinProfileUpdateComponent$handleSkipClickedIntent$2(this, minProfileInputState2, null), 3);
                boolean z3 = i7 >= CollectionsKt.K(arrayListE5);
                if (arrayListE5.size() == 1) {
                    K0(skipped);
                    return;
                } else if (z3) {
                    W0(new MinProfileUpdateIntent.NextClicked(true));
                    return;
                } else {
                    final int i8 = 1;
                    E0(new Function1() { // from class: cj0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i8) {
                                case 0:
                                    MinProfileUpdateDataState it = (MinProfileUpdateDataState) obj;
                                    Intrinsics.i(it, "it");
                                    return MinProfileUpdateDataState.a(it, null, null, null, minProfileUpdateDataState2.d + 1, false, null, null, null, 247);
                                default:
                                    MinProfileUpdateDataState it2 = (MinProfileUpdateDataState) obj;
                                    Intrinsics.i(it2, "it");
                                    return MinProfileUpdateDataState.a(it2, null, null, null, minProfileUpdateDataState2.d + 1, false, null, null, null, 247);
                            }
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(minProfileUpdateIntent instanceof MinProfileUpdateIntent.NextClicked)) {
            if (minProfileUpdateIntent.equals(MinProfileUpdateIntent.UploadProfilePhotoClicked.f10405a)) {
                BuildersKt.d(contextScope, null, null, new MinProfileUpdateComponent$handleUploadProfilePhotoClickedIntent$1(this, null), 3);
                return;
            }
            if (minProfileUpdateIntent instanceof MinProfileUpdateIntent.ProfilePhotoSelected) {
                E0(new wi0((MinProfileUpdateIntent.ProfilePhotoSelected) minProfileUpdateIntent, 6));
                return;
            } else {
                if (!(minProfileUpdateIntent instanceof MinProfileUpdateIntent.PermissionRationaleDialogInteraction)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new qi0(24));
                if (((MinProfileUpdateIntent.PermissionRationaleDialogInteraction) minProfileUpdateIntent).f10402a) {
                    this.u.b();
                    return;
                }
                return;
            }
        }
        MinProfileUpdateIntent.NextClicked nextClicked = (MinProfileUpdateIntent.NextClicked) minProfileUpdateIntent;
        final MinProfileUpdateDataState minProfileUpdateDataState3 = (MinProfileUpdateDataState) stateFlow.getValue();
        boolean z4 = minProfileUpdateDataState3.e;
        UserProfileAppModel userProfileAppModel = minProfileUpdateDataState3.f10390a;
        int i9 = minProfileUpdateDataState3.d;
        List list8 = minProfileUpdateDataState3.b;
        if (z4 || (minProfileInputState = (MinProfileInputState) CollectionsKt.L(i9, list8)) == null || userProfileAppModel == null) {
            return;
        }
        if (minProfileInputState.getF10385a() ? true : S0(minProfileInputState, (MinProfileUpdateDataState) stateFlow.getValue())) {
            if (!nextClicked.f10401a) {
                LinkedHashMap linkedHashMapL0 = L0();
                linkedHashMapL0.putAll(MinProfileUpdateContractKt.a(minProfileInputState));
                linkedHashMapL0.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(((MinProfileUpdateDataState) stateFlow.getValue()).d));
                AnalyticsContractImplKt.b(this.y, "minProfile next clicked", Source.MIN_PROFILE_UPDATE_SCREEN, linkedHashMapL0, false, 24);
            }
            if (!(i9 >= CollectionsKt.K(list8))) {
                final int i10 = 0;
                E0(new Function1() { // from class: cj0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                MinProfileUpdateDataState it = (MinProfileUpdateDataState) obj;
                                Intrinsics.i(it, "it");
                                return MinProfileUpdateDataState.a(it, null, null, null, minProfileUpdateDataState3.d + 1, false, null, null, null, 247);
                            default:
                                MinProfileUpdateDataState it2 = (MinProfileUpdateDataState) obj;
                                Intrinsics.i(it2, "it");
                                return MinProfileUpdateDataState.a(it2, null, null, null, minProfileUpdateDataState3.d + 1, false, null, null, null, 247);
                        }
                    }
                });
                return;
            }
            List list9 = list8;
            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                Iterator it = list9.iterator();
                while (it.hasNext()) {
                    if (!((MinProfileInputState) it.next()).getF10385a()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                K0(skipped);
            } else {
                E0(new qi0(23));
                BuildersKt.d(contextScope, null, null, new MinProfileUpdateComponent$submitProfileUpdate$1(this, userProfileAppModel, list8, null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object X0(MinProfileUpdateDataState minProfileUpdateDataState, TextUIState.ChaloTextUIState chaloTextUIState, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$profilePhotoStepUIState$1 minProfileUpdateComponent$profilePhotoStepUIState$1;
        MinProfileUpdateDataState minProfileUpdateDataState2;
        TextUIState textUIState;
        IconType iconType;
        ChaloPadding chaloPadding;
        if (continuationImpl instanceof MinProfileUpdateComponent$profilePhotoStepUIState$1) {
            minProfileUpdateComponent$profilePhotoStepUIState$1 = (MinProfileUpdateComponent$profilePhotoStepUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$profilePhotoStepUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$profilePhotoStepUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$profilePhotoStepUIState$1 = new MinProfileUpdateComponent$profilePhotoStepUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$profilePhotoStepUIState$1 = new MinProfileUpdateComponent$profilePhotoStepUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$profilePhotoStepUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$profilePhotoStepUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            minProfileUpdateComponent$profilePhotoStepUIState$1.L$0 = minProfileUpdateDataState;
            minProfileUpdateComponent$profilePhotoStepUIState$1.L$1 = chaloTextUIState;
            minProfileUpdateComponent$profilePhotoStepUIState$1.label = 1;
            objB = this.r.b(StringEnum.ADD_PROFILE_PHOTO, new Object[0], minProfileUpdateComponent$profilePhotoStepUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            minProfileUpdateDataState2 = minProfileUpdateDataState;
            textUIState = chaloTextUIState;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textUIState = (TextUIState) minProfileUpdateComponent$profilePhotoStepUIState$1.L$1;
            minProfileUpdateDataState2 = (MinProfileUpdateDataState) minProfileUpdateComponent$profilePhotoStepUIState$1.L$0;
            ResultKt.b(objB);
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        List list = minProfileUpdateDataState2.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof MinProfileInputState.GenderInput) {
                arrayList.add(obj);
            }
        }
        MinProfileInputState.GenderInput genderInput = (MinProfileInputState.GenderInput) CollectionsKt.H(arrayList);
        Gender gender = genderInput != null ? genderInput.f10383a : null;
        if (gender == null || gender == Gender.NULL) {
            UserProfileAppModel userProfileAppModel = minProfileUpdateDataState2.f10390a;
            gender = userProfileAppModel != null ? userProfileAppModel.d : Gender.NULL;
        }
        int[] iArr = WhenMappings.f10386a;
        int i3 = iArr[gender.ordinal()];
        if (i3 == 1) {
            iconType = IconType.IC_USER_MALE;
        } else if (i3 == 2) {
            iconType = IconType.IC_USER_FEMALE;
        } else if (i3 == 3) {
            iconType = IconType.IC_USER_TRANSGENDER;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.PROFILE_EMPTY;
        }
        ImageUIState imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().c0), UIContentScale.Fit, 0.0f, (UiEventHandler) null, 230);
        BitmapImage bitmapImage = minProfileUpdateDataState2.g;
        String str = minProfileUpdateDataState2.f;
        ProfileImageUIState existingImage = bitmapImage != null ? new ProfileImageUIState.ExistingImage(bitmapImage) : (str == null || StringsKt.F(str)) ? new ProfileImageUIState.DefaultProfileImage(imageUIState) : new ProfileImageUIState.ProfilePhotoUrl(str);
        ImageUIState imageUIState2 = new ImageUIState(IconType.IC_CAMERA, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().k0), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new bj0(this, 3)), 118);
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().f, ChaloColorToken.IvoryYellow.f9812a, UIShape.Circle.p);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().c0;
        int i4 = iArr[gender.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            chaloPadding = null;
        }
        return new MinProfileUpdateStepUIState.ProfilePhotoStepUIState(chaloTextUIState2, textUIState, new ProfileIconWithEditBtnUIState(new ProfileIconWithEditBtnUISpecs(borderUISpec, chaloPadding, f2, f, 428), existingImage, imageUIState2, UiEventHandler.Companion.a(new bj0(this, 4))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y0(UserProfileAppModel userProfileAppModel, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1 minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1;
        Long l;
        long j;
        if (continuationImpl instanceof MinProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1) {
            minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1 = (MinProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1) continuationImpl;
            int i = minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1 = new MinProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1 = new MinProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1(this, continuationImpl);
        }
        Object objP0 = minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.label;
        if (i2 == 0) {
            ResultKt.b(objP0);
            l = userProfileAppModel.g;
            if (l != null) {
                if (l.longValue() <= 0) {
                    l = null;
                }
                if (l != null) {
                    long jLongValue = l.longValue();
                    minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.L$0 = l;
                    minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.J$0 = jLongValue;
                    minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.label = 1;
                    objP0 = P0(minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1);
                    if (objP0 == obj) {
                        return obj;
                    }
                    j = jLongValue;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.J$0;
        l = (Long) minProfileUpdateComponent$resolvePrefilledDobInMillisOrNull$1.L$0;
        ResultKt.b(objP0);
        if (((SelectableDates) objP0).isSelectableDate(j)) {
            return l;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(boolean z, ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$skipButtonUIState$1 minProfileUpdateComponent$skipButtonUIState$1;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof MinProfileUpdateComponent$skipButtonUIState$1) {
            minProfileUpdateComponent$skipButtonUIState$1 = (MinProfileUpdateComponent$skipButtonUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$skipButtonUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$skipButtonUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$skipButtonUIState$1 = new MinProfileUpdateComponent$skipButtonUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$skipButtonUIState$1 = new MinProfileUpdateComponent$skipButtonUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$skipButtonUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$skipButtonUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            minProfileUpdateComponent$skipButtonUIState$1.L$0 = buttonUIStateFactory;
            minProfileUpdateComponent$skipButtonUIState$1.Z$0 = z;
            minProfileUpdateComponent$skipButtonUIState$1.label = 1;
            objB = this.r.b(StringEnum.SKIP, new Object[0], minProfileUpdateComponent$skipButtonUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = minProfileUpdateComponent$skipButtonUIState$1.Z$0;
            ButtonUIStateFactory buttonUIStateFactory2 = (ButtonUIStateFactory) minProfileUpdateComponent$skipButtonUIState$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory2;
        }
        return ButtonUIStateFactory.b(buttonUIStateFactory, (String) objB, new bj0(this, 8), UIShape.e, !z, 36);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$subtitleTextUIState$1 minProfileUpdateComponent$subtitleTextUIState$1;
        if (continuationImpl instanceof MinProfileUpdateComponent$subtitleTextUIState$1) {
            minProfileUpdateComponent$subtitleTextUIState$1 = (MinProfileUpdateComponent$subtitleTextUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$subtitleTextUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$subtitleTextUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$subtitleTextUIState$1 = new MinProfileUpdateComponent$subtitleTextUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$subtitleTextUIState$1 = new MinProfileUpdateComponent$subtitleTextUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$subtitleTextUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$subtitleTextUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            minProfileUpdateComponent$subtitleTextUIState$1.label = 1;
            objB = this.r.b(StringEnum.USER_PROFILE_SUBTITLE, new Object[0], minProfileUpdateComponent$subtitleTextUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b1(ContinuationImpl continuationImpl) {
        MinProfileUpdateComponent$titleTextUIState$1 minProfileUpdateComponent$titleTextUIState$1;
        if (continuationImpl instanceof MinProfileUpdateComponent$titleTextUIState$1) {
            minProfileUpdateComponent$titleTextUIState$1 = (MinProfileUpdateComponent$titleTextUIState$1) continuationImpl;
            int i = minProfileUpdateComponent$titleTextUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minProfileUpdateComponent$titleTextUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                minProfileUpdateComponent$titleTextUIState$1 = new MinProfileUpdateComponent$titleTextUIState$1(this, continuationImpl);
            }
        } else {
            minProfileUpdateComponent$titleTextUIState$1 = new MinProfileUpdateComponent$titleTextUIState$1(this, continuationImpl);
        }
        Object objB = minProfileUpdateComponent$titleTextUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minProfileUpdateComponent$titleTextUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            minProfileUpdateComponent$titleTextUIState$1.label = 1;
            objB = this.r.b(StringEnum.TELL_US_ABOUT_YOURSELF, new Object[0], minProfileUpdateComponent$titleTextUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new MinProfileUpdateDataState(null, emptyList, emptyList, 0, false, null, null, null);
    }
}
