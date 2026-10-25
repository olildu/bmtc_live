package app.chalo.userprofile.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DatePickerDefaults;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt$betweenRange$1;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.fileupload.domain.UploadFileToServerUseCase;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.domain.UpdateUserProfileUseCase;
import app.chalo.userprofile.domain.validation.ProfileInputValidator;
import app.chalo.userprofile.utils.UserNameUtils;
import app.chalo.userprofile.utils.UserProfileDobPickerHelper;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.pn1;
import defpackage.sh1;
import defpackage.vm1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/userprofile/ui/UserProfileFormIntent;", "Lapp/chalo/userprofile/ui/UserProfileFormDataState;", "Lapp/chalo/userprofile/ui/UserProfileFormUIState;", "Lapp/chalo/userprofile/ui/UserProfileFormSideEffect;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileFormComponent extends ChaloBaseStateMviComponent<UserProfileFormIntent, UserProfileFormDataState, UserProfileFormUIState, UserProfileFormSideEffect> {
    public final AnalyticsContract k;
    public final UserProfileDetailsProvider l;
    public final ChaloNavigationManager m;
    public final PermissionHandlerProvider n;
    public final ImagePickerProvider o;
    public final SystemHelper p;
    public final StringProvider q;
    public final KotlinToastManager r;
    public final UpdateUserProfileUseCase s;
    public final UploadFileToServerUseCase t;
    public final UserProfileFormUIStateFactory u;
    public final ProfileInputValidator v;
    public final TimeUtilsContract w;
    public final ChaloAppFeatureHelper x;
    public final BasicInfoContract y;
    public Job z;

    public UserProfileFormComponent(ComponentContext componentContext, UserProfileFormArgs userProfileFormArgs, AnalyticsContract analyticsContract, UserProfileDetailsProvider userProfileDetailsProvider, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, ImagePickerProvider imagePickerProvider, SystemHelper systemHelper, StringProvider stringProvider, KotlinToastManager kotlinToastManager, UpdateUserProfileUseCase updateUserProfileUseCase, UploadFileToServerUseCase uploadFileToServerUseCase, UserProfileFormUIStateFactory userProfileFormUIStateFactory, ProfileInputValidator profileInputValidator, TimeUtilsContract timeUtilsContract, ChaloAppFeatureHelper chaloAppFeatureHelper, BasicInfoContract basicInfoContract) {
        super(componentContext);
        this.k = analyticsContract;
        this.l = userProfileDetailsProvider;
        this.m = chaloNavigationManager;
        this.n = permissionHandlerProvider;
        this.o = imagePickerProvider;
        this.p = systemHelper;
        this.q = stringProvider;
        this.r = kotlinToastManager;
        this.s = updateUserProfileUseCase;
        this.t = uploadFileToServerUseCase;
        this.u = userProfileFormUIStateFactory;
        this.v = profileInputValidator;
        this.w = timeUtilsContract;
        this.x = chaloAppFeatureHelper;
        this.y = basicInfoContract;
        I0(new UserProfileFormIntent.InitializationIntent(userProfileFormArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(UserProfileFormComponent userProfileFormComponent, ContinuationImpl continuationImpl) {
        UserProfileFormComponent$dobSelectableDates$1 userProfileFormComponent$dobSelectableDates$1;
        String timezoneId;
        UserProfileDobPickerHelper userProfileDobPickerHelper;
        userProfileFormComponent.getClass();
        if (continuationImpl instanceof UserProfileFormComponent$dobSelectableDates$1) {
            userProfileFormComponent$dobSelectableDates$1 = (UserProfileFormComponent$dobSelectableDates$1) continuationImpl;
            int i = userProfileFormComponent$dobSelectableDates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileFormComponent$dobSelectableDates$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileFormComponent$dobSelectableDates$1 = new UserProfileFormComponent$dobSelectableDates$1(userProfileFormComponent, continuationImpl);
            }
        } else {
            userProfileFormComponent$dobSelectableDates$1 = new UserProfileFormComponent$dobSelectableDates$1(userProfileFormComponent, continuationImpl);
        }
        Object obj = userProfileFormComponent$dobSelectableDates$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileFormComponent$dobSelectableDates$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strB = userProfileFormComponent.w.b();
            BasicInfoContract basicInfoContract = userProfileFormComponent.y;
            UserProfileDobPickerHelper userProfileDobPickerHelper2 = UserProfileDobPickerHelper.f10412a;
            userProfileFormComponent$dobSelectableDates$1.L$0 = userProfileDobPickerHelper2;
            userProfileFormComponent$dobSelectableDates$1.L$1 = strB;
            userProfileFormComponent$dobSelectableDates$1.label = 1;
            Object objC = basicInfoContract.c(userProfileFormComponent$dobSelectableDates$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            timezoneId = strB;
            userProfileDobPickerHelper = userProfileDobPickerHelper2;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) userProfileFormComponent$dobSelectableDates$1.L$1;
            userProfileDobPickerHelper = (UserProfileDobPickerHelper) userProfileFormComponent$dobSelectableDates$1.L$0;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(UserProfileFormComponent userProfileFormComponent, ContinuationImpl continuationImpl) {
        UserProfileFormComponent$isAnyFormFieldUpdated$1 userProfileFormComponent$isAnyFormFieldUpdated$1;
        String strA;
        Long l;
        String strValueOf;
        userProfileFormComponent.getClass();
        if (continuationImpl instanceof UserProfileFormComponent$isAnyFormFieldUpdated$1) {
            userProfileFormComponent$isAnyFormFieldUpdated$1 = (UserProfileFormComponent$isAnyFormFieldUpdated$1) continuationImpl;
            int i = userProfileFormComponent$isAnyFormFieldUpdated$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileFormComponent$isAnyFormFieldUpdated$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileFormComponent$isAnyFormFieldUpdated$1 = new UserProfileFormComponent$isAnyFormFieldUpdated$1(userProfileFormComponent, continuationImpl);
            }
        } else {
            userProfileFormComponent$isAnyFormFieldUpdated$1 = new UserProfileFormComponent$isAnyFormFieldUpdated$1(userProfileFormComponent, continuationImpl);
        }
        Object objL = userProfileFormComponent$isAnyFormFieldUpdated$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileFormComponent$isAnyFormFieldUpdated$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objL);
            UserProfileDetailsProvider userProfileDetailsProvider = userProfileFormComponent.l;
            userProfileFormComponent$isAnyFormFieldUpdated$1.label = 1;
            objL = userProfileDetailsProvider.l(userProfileFormComponent$isAnyFormFieldUpdated$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) objL;
        String str = "";
        if (userProfileAppModel == null || (strA = UserNameUtils.a(userProfileAppModel.f10305a, userProfileAppModel.b)) == null) {
            strA = "";
        }
        UserProfileFormDataState userProfileFormDataState = (UserProfileFormDataState) userProfileFormComponent.f.getValue();
        if (userProfileAppModel != null) {
            Integer numB = userProfileAppModel.b(userProfileFormComponent.p, userProfileFormComponent.w);
            if (numB != null && (strValueOf = String.valueOf(numB.intValue())) != null) {
                str = strValueOf;
            }
        }
        if (userProfileAppModel == null || (l = userProfileAppModel.g) == null || l.longValue() <= 0) {
            l = null;
        }
        if (Intrinsics.d(userProfileAppModel != null ? userProfileAppModel.c : null, userProfileFormDataState.j) && (!userProfileFormDataState.f ? str.equals(userProfileFormDataState.d) : Intrinsics.d(l, userProfileFormDataState.e))) {
            if ((userProfileAppModel != null ? userProfileAppModel.d : null) == userProfileFormDataState.b && userProfileAppModel.h.equalsIgnoreCase(userProfileFormDataState.c) && strA.equals(userProfileFormDataState.f10349a) && userProfileFormDataState.k == null) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final void H0(UserProfileFormComponent userProfileFormComponent, String str) {
        AnalyticsContractImplKt.b(userProfileFormComponent.k, "user profile edit failed", Source.USER_PROFILE_FORM, vo1.s("reason", str), false, 24);
    }

    public final void I0(UserProfileFormIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof UserProfileFormIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new UserProfileFormComponent$handleInitializationIntent$1(this, (UserProfileFormIntent.InitializationIntent) intent, null), 3);
            return;
        }
        if (intent instanceof UserProfileFormIntent.BackBtnClicked) {
            BuildersKt.d(contextScope, null, null, new UserProfileFormComponent$handleBackBtnClicked$1(this, null), 3);
            return;
        }
        if (intent instanceof UserProfileFormIntent.UploadProfilePhotoClicked) {
            BuildersKt.d(contextScope, null, null, new UserProfileFormComponent$handleUploadProfilePhotoClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof UserProfileFormIntent.NameEntered) {
            E0(new sh1((UserProfileFormIntent.NameEntered) intent, 17));
            return;
        }
        if (intent instanceof UserProfileFormIntent.GenderSelected) {
            AnalyticsContractImplKt.b(this.k, "user profile gender changed", Source.USER_PROFILE_FORM, null, false, 28);
            E0(new sh1((UserProfileFormIntent.GenderSelected) intent, 19));
            return;
        }
        if (intent instanceof UserProfileFormIntent.EmailIdEntered) {
            E0(new sh1((UserProfileFormIntent.EmailIdEntered) intent, 18));
            return;
        }
        if (intent instanceof UserProfileFormIntent.AgeEntered) {
            E0(new sh1((UserProfileFormIntent.AgeEntered) intent, 20));
            return;
        }
        if (intent.equals(UserProfileFormIntent.DobFieldClicked.f10357a)) {
            UserProfileFormDataState userProfileFormDataState = (UserProfileFormDataState) this.f.getValue();
            if (userProfileFormDataState.f) {
                BuildersKt.d(contextScope, null, null, new UserProfileFormComponent$handleDobFieldClickedIntent$1(this, userProfileFormDataState, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof UserProfileFormIntent.DobSelected) {
            E0(new sh1((UserProfileFormIntent.DobSelected) intent, 21));
            return;
        }
        if (intent.equals(UserProfileFormIntent.DobPickerDismissed.f10358a)) {
            E0(new vm1(23));
            return;
        }
        if (intent instanceof UserProfileFormIntent.FieldFocusChanged) {
            E0(new sh1((UserProfileFormIntent.FieldFocusChanged) intent, 23));
            return;
        }
        if (intent instanceof UserProfileFormIntent.SaveBtnClicked) {
            BuildersKt.d(contextScope, null, null, new UserProfileFormComponent$handleSaveBtnClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof UserProfileFormIntent.ProfilePhotoSelected) {
            AnalyticsContractImplKt.b(this.k, "user profile photo changed", Source.USER_PROFILE_FORM, null, false, 28);
            E0(new sh1((UserProfileFormIntent.ProfilePhotoSelected) intent, 22));
            return;
        }
        if (intent instanceof UserProfileFormIntent.DialogPositiveBtnClicked) {
            AnalyticsContractImplKt.b(this.k, "user profile form back clicked", Source.USER_PROFILE_EDIT, null, false, 28);
            E0(new vm1(23));
            q0(new pn1(this, 0));
            return;
        }
        if (intent instanceof UserProfileFormIntent.DialogNegativeBtnClicked) {
            E0(new vm1(23));
        } else {
            if (!(intent instanceof UserProfileFormIntent.PermissionRationaleDialogInteraction)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new vm1(23));
            if (((UserProfileFormIntent.PermissionRationaleDialogInteraction) intent).f10365a) {
                this.p.b();
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        UserProfileFormComponent$convertToUiState$2 userProfileFormComponent$convertToUiState$2 = new UserProfileFormComponent$convertToUiState$2(1, this, UserProfileFormComponent.class, "processIntent", "processIntent(Lapp/chalo/userprofile/ui/UserProfileFormIntent;)V", 0);
        return this.u.a((UserProfileFormDataState) obj, userProfileFormComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new UserProfileFormDataState(null, null, null, null, null, false, null, null, null, 16383);
    }
}
