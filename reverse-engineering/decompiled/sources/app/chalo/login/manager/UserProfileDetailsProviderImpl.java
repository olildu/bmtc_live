package app.chalo.login.manager;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DatePickerDefaults;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt$betweenRange$1;
import app.chalo.config.ChaloPhoneNumberCountry;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.MinimumProfileRequirement;
import app.chalo.userprofile.ProfileCompletenessField;
import app.chalo.userprofile.ProfileCompletenessResult;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.UserProfileLocalInfoModel;
import app.chalo.userprofile.UserProfileLocalInfoModelKt;
import app.chalo.userprofile.data.local.UserProfileLocalDataSource;
import app.chalo.userprofile.domain.validation.ProfileInputValidator;
import app.chalo.utils.ChaloCountryDetails;
import app.chalo.utils.ChaloSupportedCountry;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/manager/UserProfileDetailsProviderImpl;", "Lapp/chalo/providers/UserProfileDetailsProvider;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileDetailsProviderImpl implements UserProfileDetailsProvider {
    public static final List h = CollectionsKt.S(ProfileCompletenessField.PHOTO, ProfileCompletenessField.NAME, ProfileCompletenessField.EMAIL, ProfileCompletenessField.AGE, ProfileCompletenessField.GENDER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileLocalDataSource f5275a;
    public final CoroutineContextProvider b;
    public final TimeUtilsContract c;
    public final SystemHelper d;
    public final ProfileInputValidator e;
    public final ChaloAppFeatureHelper f;
    public final StateFlow g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/manager/UserProfileDetailsProviderImpl$Companion;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5276a;

        static {
            int[] iArr = new int[ProfileCompletenessField.values().length];
            try {
                iArr[ProfileCompletenessField.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileCompletenessField.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileCompletenessField.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileCompletenessField.GENDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileCompletenessField.AGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5276a = iArr;
        }
    }

    public UserProfileDetailsProviderImpl(UserProfileLocalDataSource userProfileLocalDataSource, CoroutineContextProvider coroutineContextProvider, TimeUtilsContract timeUtilsContract, SystemHelper systemHelper, ProfileInputValidator profileInputValidator, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        this.f5275a = userProfileLocalDataSource;
        this.b = coroutineContextProvider;
        this.c = timeUtilsContract;
        this.d = systemHelper;
        this.e = profileInputValidator;
        this.f = chaloAppFeatureHelper;
        this.g = FlowKt.G(userProfileLocalDataSource.b(), CoroutineScopeKt.a(coroutineContextProvider.b()), SharingStarted.Companion.f17836a, Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(UserProfileDetailsProviderImpl userProfileDetailsProviderImpl, ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderImpl$createFallbackConfig$1 userProfileDetailsProviderImpl$createFallbackConfig$1;
        List list;
        Object next;
        userProfileDetailsProviderImpl.getClass();
        if (continuationImpl instanceof UserProfileDetailsProviderImpl$createFallbackConfig$1) {
            userProfileDetailsProviderImpl$createFallbackConfig$1 = (UserProfileDetailsProviderImpl$createFallbackConfig$1) continuationImpl;
            int i = userProfileDetailsProviderImpl$createFallbackConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderImpl$createFallbackConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderImpl$createFallbackConfig$1 = new UserProfileDetailsProviderImpl$createFallbackConfig$1(userProfileDetailsProviderImpl, continuationImpl);
            }
        } else {
            userProfileDetailsProviderImpl$createFallbackConfig$1 = new UserProfileDetailsProviderImpl$createFallbackConfig$1(userProfileDetailsProviderImpl, continuationImpl);
        }
        Object obj = userProfileDetailsProviderImpl$createFallbackConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderImpl$createFallbackConfig$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                List list2 = ChaloSupportedCountry.f10417a;
                UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1 userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E = userProfileDetailsProviderImpl.e();
                userProfileDetailsProviderImpl$createFallbackConfig$1.L$0 = list2;
                userProfileDetailsProviderImpl$createFallbackConfig$1.label = 1;
                Object objV = FlowKt.v(userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E, userProfileDetailsProviderImpl$createFallbackConfig$1);
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objV;
                list = list2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) userProfileDetailsProviderImpl$createFallbackConfig$1.L$0;
                ResultKt.b(obj);
            }
            UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
            String str = userProfileAppModel != null ? userProfileAppModel.f : null;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ChaloCountryDetails) next).c.equals(str));
            ChaloCountryDetails chaloCountryDetails = (ChaloCountryDetails) next;
            if (chaloCountryDetails != null) {
                ChaloPhoneNumberCountry.Companion companion = ChaloPhoneNumberCountry.INSTANCE;
                String str2 = chaloCountryDetails.f10416a;
                companion.getClass();
                ChaloPhoneNumberCountry chaloPhoneNumberCountryA = ChaloPhoneNumberCountry.Companion.a(str2);
                String str3 = chaloCountryDetails.b;
                String str4 = chaloCountryDetails.c;
                Integer num = (Integer) CollectionsKt.H(chaloCountryDetails.d);
                return new CountryPhoneNumberConfig(chaloPhoneNumberCountryA, str3, str4, num != null ? num.intValue() : 10);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final Object d(CountryPhoneNumberConfig countryPhoneNumberConfig, Continuation continuation) {
        Object objD = this.f5275a.d(countryPhoneNumberConfig, continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1] */
    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1 e() {
        final Flow flowE = this.f5275a.e();
        return new Flow<UserProfileAppModel>() { // from class: app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5280a;

                /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1$2", f = "UserProfileDetailsProviderImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f5280a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) obj;
                        UserProfileAppModel userProfileAppModelA = userProfileLocalInfoModel != null ? UserProfileLocalInfoModelKt.a(userProfileLocalInfoModel) : null;
                        anonymousClass1.label = 1;
                        if (this.f5280a.emit(userProfileAppModelA, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowE.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final UserProfileAppModel f() {
        return (UserProfileAppModel) BuildersKt.e(EmptyCoroutineContext.f17583a, new UserProfileDetailsProviderImpl$getUserProfileDetails$1(this, null));
    }

    @Override // app.chalo.providers.UserProfileDetailsProvider
    /* JADX INFO: renamed from: g, reason: from getter */
    public final StateFlow getG() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final Serializable h(ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1 userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1;
        UserProfileAppModel userProfileAppModel;
        boolean zBooleanValue;
        Object objA;
        boolean z;
        UserProfileAppModel userProfileAppModel2;
        boolean zBooleanValue2;
        SetBuilder setBuilder;
        SystemHelper systemHelper;
        TimeUtilsContract timeUtilsContract;
        String strValueOf;
        boolean z2;
        Long l;
        Long l2;
        if (continuationImpl instanceof UserProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1) {
            userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1 = (UserProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1) continuationImpl;
            int i = userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1 = new UserProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1(this, continuationImpl);
            }
        } else {
            userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1 = new UserProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1(this, continuationImpl);
        }
        Object objL = userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label;
        ChaloAppFeatureHelper chaloAppFeatureHelper = this.f;
        boolean zIsSelectableDate = true;
        if (i2 == 0) {
            ResultKt.b(objL);
            userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label = 1;
            objL = l(userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1);
            if (objL != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objL);
        } else {
            if (i2 == 2) {
                userProfileAppModel = (UserProfileAppModel) userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.L$0;
                ResultKt.b(objL);
                zBooleanValue = ((Boolean) objL).booleanValue();
                userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.L$0 = userProfileAppModel;
                userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.Z$0 = zBooleanValue;
                userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label = 3;
                objA = chaloAppFeatureHelper.a(userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1);
                if (objA != coroutineSingletons) {
                    z = zBooleanValue;
                    objL = objA;
                    userProfileAppModel2 = userProfileAppModel;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.Z$0;
            userProfileAppModel2 = (UserProfileAppModel) userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.L$0;
            ResultKt.b(objL);
        }
        zBooleanValue2 = ((Boolean) objL).booleanValue();
        setBuilder = new SetBuilder();
        if (userProfileAppModel2.d == Gender.NULL) {
            setBuilder.add(MinimumProfileRequirement.Gender);
        }
        systemHelper = this.d;
        timeUtilsContract = this.c;
        if (z) {
            if (StringsKt.F(userProfileAppModel2.f10305a) || !StringsKt.F(userProfileAppModel2.b)) {
                z2 = false;
            } else {
                z2 = true;
            }
            l = userProfileAppModel2.g;
            if (l != null) {
                l2 = l.longValue() > 0 ? l : null;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    String strB = timeUtilsContract.b();
                    long j = systemHelper.j();
                    DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                    PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                    Intrinsics.i(datePickerDefaults, "<this>");
                    zIsSelectableDate = true ^ new ChaloDatePickerKt$betweenRange$1(j - 3153600000000L, j, strB).isSelectableDate(jLongValue);
                }
            }
            if (z2) {
                setBuilder.add(MinimumProfileRequirement.Name);
            }
            if (zIsSelectableDate) {
                setBuilder.add(MinimumProfileRequirement.Dob);
            }
        } else {
            Integer numB = userProfileAppModel2.b(systemHelper, timeUtilsContract);
            strValueOf = numB != null ? String.valueOf(numB.intValue()) : null;
            if (strValueOf != null || this.e.a(strValueOf) != null) {
                setBuilder.add(MinimumProfileRequirement.Age);
            }
        }
        if (zBooleanValue2 && StringsKt.F(userProfileAppModel2.c)) {
            setBuilder.add(MinimumProfileRequirement.ProfilePhoto);
        }
        return setBuilder.a();
        UserProfileAppModel userProfileAppModel3 = (UserProfileAppModel) objL;
        if (userProfileAppModel3 == null) {
            return EmptySet.f17559a;
        }
        userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.L$0 = userProfileAppModel3;
        userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label = 2;
        Object objT = chaloAppFeatureHelper.t(userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1);
        if (objT != coroutineSingletons) {
            userProfileAppModel = userProfileAppModel3;
            objL = objT;
            zBooleanValue = ((Boolean) objL).booleanValue();
            userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.L$0 = userProfileAppModel;
            userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.Z$0 = zBooleanValue;
            userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1.label = 3;
            objA = chaloAppFeatureHelper.a(userProfileDetailsProviderImpl$getMissingMinimumProfileRequirements$1);
            if (objA != coroutineSingletons) {
                z = zBooleanValue;
                objL = objA;
                userProfileAppModel2 = userProfileAppModel;
                zBooleanValue2 = ((Boolean) objL).booleanValue();
                setBuilder = new SetBuilder();
                if (userProfileAppModel2.d == Gender.NULL) {
                    setBuilder.add(MinimumProfileRequirement.Gender);
                }
                systemHelper = this.d;
                timeUtilsContract = this.c;
                if (z) {
                    if (StringsKt.F(userProfileAppModel2.f10305a)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    l = userProfileAppModel2.g;
                    if (l != null) {
                        if (l.longValue() > 0) {
                        }
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            String strB2 = timeUtilsContract.b();
                            long j2 = systemHelper.j();
                            DatePickerDefaults datePickerDefaults2 = DatePickerDefaults.INSTANCE;
                            PaddingValues paddingValues2 = ChaloDatePickerKt.f1888a;
                            Intrinsics.i(datePickerDefaults2, "<this>");
                            zIsSelectableDate = true ^ new ChaloDatePickerKt$betweenRange$1(j2 - 3153600000000L, j2, strB2).isSelectableDate(jLongValue2);
                        }
                    }
                    if (z2) {
                        setBuilder.add(MinimumProfileRequirement.Name);
                    }
                    if (zIsSelectableDate) {
                        setBuilder.add(MinimumProfileRequirement.Dob);
                    }
                } else {
                    Integer numB2 = userProfileAppModel2.b(systemHelper, timeUtilsContract);
                    if (numB2 != null) {
                    }
                    if (strValueOf != null) {
                        setBuilder.add(MinimumProfileRequirement.Age);
                    } else {
                        setBuilder.add(MinimumProfileRequirement.Age);
                    }
                }
                if (zBooleanValue2) {
                    setBuilder.add(MinimumProfileRequirement.ProfilePhoto);
                }
                return setBuilder.a();
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final Object i(ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1 userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1;
        if (continuationImpl instanceof UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1) {
            userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1 = (UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1) continuationImpl;
            int i = userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1 = new UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1(this, continuationImpl);
            }
        } else {
            userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1 = new UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1(this, continuationImpl);
        }
        Object objG = userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1.label = 1;
            objG = this.f5275a.g(userProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        final Flow flow = (Flow) objG;
        return new Flow<CountryPhoneNumberConfig>() { // from class: app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5278a;
                public final /* synthetic */ UserProfileDetailsProviderImpl b;

                /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2", f = "UserProfileDetailsProviderImpl.kt", l = {54, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, UserProfileDetailsProviderImpl userProfileDetailsProviderImpl) {
                    this.f5278a = flowCollector;
                    this.b = userProfileDetailsProviderImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
                
                    if (r8.emit(r7, r0) == r1) goto L26;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2$1 r0 = (app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2$1 r0 = new app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3a
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r8)
                        goto L63
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.ResultKt.b(r8)
                        goto L54
                    L3a:
                        kotlin.ResultKt.b(r8)
                        app.chalo.config.CountryPhoneNumberConfig r7 = (app.chalo.config.CountryPhoneNumberConfig) r7
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f5278a
                        if (r7 == 0) goto L44
                        goto L57
                    L44:
                        r0.L$0 = r8
                        r0.label = r4
                        app.chalo.login.manager.UserProfileDetailsProviderImpl r7 = r6.b
                        java.lang.Object r7 = app.chalo.login.manager.UserProfileDetailsProviderImpl.a(r7, r0)
                        if (r7 != r1) goto L51
                        goto L62
                    L51:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L54:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L57:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L63
                    L62:
                        return r1
                    L63:
                        kotlin.Unit r7 = kotlin.Unit.f17538a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.manager.UserProfileDetailsProviderImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final Object j(ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderImpl$getProfileCompleteness$1 userProfileDetailsProviderImpl$getProfileCompleteness$1;
        if (continuationImpl instanceof UserProfileDetailsProviderImpl$getProfileCompleteness$1) {
            userProfileDetailsProviderImpl$getProfileCompleteness$1 = (UserProfileDetailsProviderImpl$getProfileCompleteness$1) continuationImpl;
            int i = userProfileDetailsProviderImpl$getProfileCompleteness$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderImpl$getProfileCompleteness$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderImpl$getProfileCompleteness$1 = new UserProfileDetailsProviderImpl$getProfileCompleteness$1(this, continuationImpl);
            }
        } else {
            userProfileDetailsProviderImpl$getProfileCompleteness$1 = new UserProfileDetailsProviderImpl$getProfileCompleteness$1(this, continuationImpl);
        }
        Object objL = userProfileDetailsProviderImpl$getProfileCompleteness$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderImpl$getProfileCompleteness$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            userProfileDetailsProviderImpl$getProfileCompleteness$1.label = 1;
            objL = l(userProfileDetailsProviderImpl$getProfileCompleteness$1);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) objL;
        if (userProfileAppModel == null) {
            return null;
        }
        List list = h;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int i3 = WhenMappings.f5276a[((ProfileCompletenessField) obj2).ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Integer numB = userProfileAppModel.b(this.d, this.c);
                            String strValueOf = numB != null ? String.valueOf(numB.intValue()) : null;
                            if (strValueOf == null || this.e.a(strValueOf) != null) {
                                arrayList.add(obj2);
                            }
                        } else if (userProfileAppModel.d == Gender.NULL) {
                            arrayList.add(obj2);
                        }
                    } else if (StringsKt.F(userProfileAppModel.h)) {
                        arrayList.add(obj2);
                    }
                } else if (StringsKt.F(userProfileAppModel.f10305a) && StringsKt.F(userProfileAppModel.b)) {
                    arrayList.add(obj2);
                }
            } else if (StringsKt.F(userProfileAppModel.c)) {
                arrayList.add(obj2);
            }
        }
        Set setG0 = CollectionsKt.G0(arrayList);
        int size = list.size();
        int size2 = size - setG0.size();
        if (size2 < 0) {
            size2 = 0;
        }
        return new ProfileCompletenessResult(size2, size, setG0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final Object k(ContinuationImpl continuationImpl) {
        UserProfileDetailsProviderImpl$getUserIdAsync$1 userProfileDetailsProviderImpl$getUserIdAsync$1;
        if (continuationImpl instanceof UserProfileDetailsProviderImpl$getUserIdAsync$1) {
            userProfileDetailsProviderImpl$getUserIdAsync$1 = (UserProfileDetailsProviderImpl$getUserIdAsync$1) continuationImpl;
            int i = userProfileDetailsProviderImpl$getUserIdAsync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderImpl$getUserIdAsync$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderImpl$getUserIdAsync$1 = new UserProfileDetailsProviderImpl$getUserIdAsync$1(this, continuationImpl);
            }
        } else {
            userProfileDetailsProviderImpl$getUserIdAsync$1 = new UserProfileDetailsProviderImpl$getUserIdAsync$1(this, continuationImpl);
        }
        Object objF = userProfileDetailsProviderImpl$getUserIdAsync$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderImpl$getUserIdAsync$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            userProfileDetailsProviderImpl$getUserIdAsync$1.label = 1;
            objF = this.f5275a.f(userProfileDetailsProviderImpl$getUserIdAsync$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) objF;
        if (userProfileLocalInfoModel != null) {
            return userProfileLocalInfoModel.f10306a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final Object l(Continuation continuation) {
        UserProfileDetailsProviderImpl$getUserProfileDetailsAsync$1 userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1;
        if (continuation instanceof UserProfileDetailsProviderImpl$getUserProfileDetailsAsync$1) {
            userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1 = (UserProfileDetailsProviderImpl$getUserProfileDetailsAsync$1) continuation;
            int i = userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1 = new UserProfileDetailsProviderImpl$getUserProfileDetailsAsync$1(this, continuation);
            }
        } else {
            userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1 = new UserProfileDetailsProviderImpl$getUserProfileDetailsAsync$1(this, continuation);
        }
        Object objF = userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1.label = 1;
            objF = this.f5275a.f(userProfileDetailsProviderImpl$getUserProfileDetailsAsync$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) objF;
        if (userProfileLocalInfoModel != null) {
            return UserProfileLocalInfoModelKt.a(userProfileLocalInfoModel);
        }
        return null;
    }

    @Override // app.chalo.providers.UserProfileDetailsProvider
    public final String m() {
        return (String) BuildersKt.e(EmptyCoroutineContext.f17583a, new UserProfileDetailsProviderImpl$getUserId$1(this, null));
    }
}
