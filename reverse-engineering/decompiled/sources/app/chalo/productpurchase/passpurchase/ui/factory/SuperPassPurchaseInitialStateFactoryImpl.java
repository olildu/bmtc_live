package app.chalo.productpurchase.passpurchase.ui.factory;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.passpurchase.data.ProfilePhotoProofPrefillHelperKt;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedContractKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.superpass.data.models.entities.RejectionStatus;
import app.chalo.superpass.data.models.entities.SuperPassProofProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/factory/SuperPassPurchaseInitialStateFactoryImpl;", "Lapp/chalo/productpurchase/passpurchase/ui/factory/SuperPassPurchaseInitialStateFactory;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassPurchaseInitialStateFactoryImpl implements SuperPassPurchaseInitialStateFactory {
    public static SuperPassUserDetails k(UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract) {
        UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
        if (userProfileAppModelF == null) {
            return new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247);
        }
        SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
        SuperPassUserDetails superPassUserDetails = new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247);
        companion.getClass();
        return SuperPassUserDetails.Companion.c(userProfileAppModelF, superPassUserDetails, timeUtilsContract);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    public static HashMap m(List list, PassApplicationRejectionReasons passApplicationRejectionReasons, Map map, String str, StateCreationDependencies stateCreationDependencies) {
        String str2;
        Set setG0;
        List list2;
        List<ProofRejectionReason> list3;
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map2.put(((ProofDocumentProps) it.next()).f9539a, new ProofUploadDetails((String) null, (BitmapImage) null, (String) null, (ProofUploadStatus) null, 31));
        }
        if (passApplicationRejectionReasons != null && (list3 = passApplicationRejectionReasons.f9547a) != null) {
            for (ProofRejectionReason proofRejectionReason : list3) {
                if (proofRejectionReason.f9554a == RejectionStatus.VALID) {
                    map2.put(proofRejectionReason.b, new ProofUploadDetails(proofRejectionReason.c, (BitmapImage) null, "", ProofUploadStatus.UPLOAD_SUCCESSFUL, false));
                }
            }
        }
        if (map != null) {
            CrashlyticsLogger crashlyticsLogger = stateCreationDependencies.g;
            try {
                for (Map.Entry entry : map.entrySet()) {
                    map2.put((String) entry.getKey(), new ProofUploadDetails(((SuperPassProofProperties) entry.getValue()).b, (BitmapImage) null, "", ProofUploadStatus.UPLOAD_SUCCESSFUL, false));
                }
            } catch (Exception e) {
                crashlyticsLogger.i(e);
            }
        }
        UserProfileAppModel userProfileAppModelF = stateCreationDependencies.f.f();
        if (userProfileAppModelF != null) {
            str2 = userProfileAppModelF.c;
            if (StringsKt.F(str2)) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        if (str != null) {
            if (StringsKt.F(str)) {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
        }
        if (passApplicationRejectionReasons == null || (list2 = passApplicationRejectionReasons.f9547a) == null) {
            setG0 = EmptySet.f17559a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((ProofRejectionReason) obj).f9554a == RejectionStatus.INVALID) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((ProofRejectionReason) obj2).b);
            }
            setG0 = CollectionsKt.G0(arrayList2);
            if (setG0 == null) {
                setG0 = EmptySet.f17559a;
            }
        }
        ProfilePhotoProofPrefillHelperKt.a(list, map2, str2, setG0);
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactory
    public final Object a(BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1 superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1;
        AgencyInfoAppModel agencyInfoAppModel;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1) {
            superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1 = (SuperPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1 = new SuperPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1 = new SuperPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1(this, continuationImpl);
        }
        Object objL = superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            String str = bookableSuperPassConfiguration.b.k;
            CityAppModel cityAppModel = (CityAppModel) stateCreationDependencies.d.getE().getValue();
            AgencyInfoAppModel agencyInfoAppModel2 = null;
            ArrayList arrayListA = cityAppModel != null ? CityAppModelKt.a(ChaloTransitMode.BUS, cityAppModel) : null;
            if (arrayListA != null) {
                int size = arrayListA.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayListA.get(i3);
                    i3++;
                    AgencyInfoAppModel agencyInfoAppModel3 = (AgencyInfoAppModel) obj2;
                    if (StringsKt.x(agencyInfoAppModel3.f8852a, str, true)) {
                        agencyInfoAppModel2 = agencyInfoAppModel3;
                    }
                }
            }
            superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.L$0 = agencyInfoAppModel2;
            superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.label = 1;
            objL = agencyInfoAppModel2 != null ? l(bookableSuperPassConfiguration.f, str, stateCreationDependencies, superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1) : EmptyList.f17557a;
            if (objL == obj) {
                return obj;
            }
            agencyInfoAppModel = agencyInfoAppModel2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            agencyInfoAppModel = (AgencyInfoAppModel) superPassPurchaseInitialStateFactoryImpl$deriveAgencyAndProofDetails$1.L$0;
            ResultKt.b(objL);
        }
        return new AgencyAndProofDetails(agencyInfoAppModel, (List) objL);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactory
    public final Object b(SuperPassPurchaseArgs superPassPurchaseArgs, StateCreationDependencies stateCreationDependencies, Continuation continuation) {
        Pair pair;
        vo1.x("Creating initial state for args: ", Reflection.a(superPassPurchaseArgs.getClass()).f(), "message");
        boolean z = superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof;
        if (z) {
            SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof freshWithoutProof = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof) superPassPurchaseArgs;
            pair = new Pair(freshWithoutProof.d, freshWithoutProof.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) {
            SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof freshWithProof = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) superPassPurchaseArgs;
            pair = new Pair(freshWithProof.d, freshWithProof.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) {
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof freshWithoutProof2 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) superPassPurchaseArgs;
            pair = new Pair(freshWithoutProof2.d, freshWithoutProof2.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) {
            SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof freshWithProof2 = (SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) superPassPurchaseArgs;
            pair = new Pair(freshWithProof2.d, freshWithProof2.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) {
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification paymentPostVerification = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) superPassPurchaseArgs;
            pair = new Pair(paymentPostVerification.d, paymentPostVerification.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) {
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification paymentModeChangedNoVerification = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) superPassPurchaseArgs;
            pair = new Pair(paymentModeChangedNoVerification.d, paymentModeChangedNoVerification.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) {
            SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication reapplication = (SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) superPassPurchaseArgs;
            pair = new Pair(reapplication.d, reapplication.e);
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) {
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew renew = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) superPassPurchaseArgs;
            pair = new Pair(renew.d, renew.e);
        } else {
            pair = new Pair(null, null);
        }
        Source source = (Source) pair.getFirst();
        String str = (String) pair.getSecond();
        if (source == null || str == null) {
            String message = "Missing required data: source=" + source + ", config=" + str;
            Intrinsics.i(message, "message");
            return SuperPassPurchaseSharedContractKt.f8345a;
        }
        SuperPassPurchaseSharedState superPassPurchaseSharedState = SuperPassPurchaseSharedContractKt.f8345a;
        boolean z2 = superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof;
        if (!z2 && !z && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs) && !superPassPurchaseArgs.equals(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE) && !(superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs)) {
            throw new NoWhenBranchMatchedException();
        }
        BookableSuperPassConfiguration.Companion companion = BookableSuperPassConfiguration.INSTANCE;
        companion.getClass();
        Json json = ChaloJson.b;
        json.getClass();
        BookableSuperPassConfiguration bookableSuperPassConfiguration = (BookableSuperPassConfiguration) json.b(str, companion.serializer());
        if (z) {
            return f((SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) {
            return d((SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (z2) {
            return e((SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) {
            return c((SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) {
            return i((SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) {
            return h((SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) {
            return g((SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) {
            return j((SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) superPassPurchaseArgs, bookableSuperPassConfiguration, stateCreationDependencies, (ContinuationImpl) continuation);
        }
        if ((superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) || (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs) || (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs) || (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs)) {
            return SuperPassPurchaseSharedContractKt.f8345a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof freshWithProof, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1 superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1;
        Object objB;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof freshWithProof2;
        SuperPassUserDetails superPassUserDetails;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassUserDetails superPassUserDetails2;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof freshWithProof3;
        long j;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        StateCreationDependencies stateCreationDependencies3 = stateCreationDependencies;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1) {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1(this, continuationImpl);
        }
        Object objA = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str = freshWithProof.f;
            if (str != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, SuperPassPurchaseStopsInfo.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) objB;
            } else {
                superPassPurchaseStopsInfo = null;
            }
            SuperPassUserDetails superPassUserDetailsK = k(stateCreationDependencies3.f, stateCreationDependencies3.b);
            BasicInfoContract basicInfoContract = stateCreationDependencies3.c;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$0 = freshWithProof;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$2 = stateCreationDependencies3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$3 = superPassPurchaseStopsInfo;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$4 = superPassUserDetailsK;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.label = 1;
            Object objC = basicInfoContract.c(superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1);
            if (objC != obj) {
                freshWithProof2 = freshWithProof;
                superPassUserDetails = superPassUserDetailsK;
                superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo;
                objA = objC;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            }
            return obj;
        }
        if (i2 == 1) {
            superPassUserDetails = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$4;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo4 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$3;
            StateCreationDependencies stateCreationDependencies4 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$2;
            bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$1;
            freshWithProof2 = (SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$0;
            ResultKt.b(objA);
            superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo4;
            stateCreationDependencies3 = stateCreationDependencies4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.J$0;
            superPassUserDetails2 = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$4;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo5 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$1;
            freshWithProof3 = (SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$0;
            ResultKt.b(objA);
            j2 = j3;
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo5;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration4;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) objA;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(freshWithProof3.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowFreshPurchase", PassApplicationActionRequired.FRESH, null, null, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel != null, superPassPurchaseStopsInfo3, freshWithProof3.g, list, m(list, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196704);
        long jLongValue = ((Number) objA).longValue();
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$0 = freshWithProof2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$1 = bookableSuperPassConfiguration2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$2 = stateCreationDependencies3;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$3 = superPassPurchaseStopsInfo2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.L$4 = superPassUserDetails;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.J$0 = jLongValue;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.J$1 = -1L;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1.label = 2;
        objA = a(bookableSuperPassConfiguration2, stateCreationDependencies3, superPassPurchaseInitialStateFactoryImpl$createFreshWithProofPassengerSelectionState$1);
        if (objA != obj) {
            superPassUserDetails2 = superPassUserDetails;
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo2;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
            freshWithProof3 = freshWithProof2;
            j = jLongValue;
            j2 = -1;
            stateCreationDependencies2 = stateCreationDependencies3;
            AgencyAndProofDetails agencyAndProofDetails2 = (AgencyAndProofDetails) objA;
            AgencyInfoAppModel agencyInfoAppModel2 = agencyAndProofDetails2.f8432a;
            List list2 = agencyAndProofDetails2.b;
            return new SuperPassPurchaseSharedState(freshWithProof3.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel2, "flowFreshPurchase", PassApplicationActionRequired.FRESH, null, null, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel2 != null, superPassPurchaseStopsInfo3, freshWithProof3.g, list2, m(list2, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196704);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof freshWithProof, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1 superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1;
        Object objB;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof freshWithProof2;
        SuperPassUserDetails superPassUserDetails;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassUserDetails superPassUserDetails2;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof freshWithProof3;
        long j;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        StateCreationDependencies stateCreationDependencies3 = stateCreationDependencies;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1) {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1(this, continuationImpl);
        }
        Object objA = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str = freshWithProof.f;
            if (str != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, SuperPassPurchaseStopsInfo.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) objB;
            } else {
                superPassPurchaseStopsInfo = null;
            }
            SuperPassUserDetails superPassUserDetailsK = k(stateCreationDependencies3.f, stateCreationDependencies3.b);
            BasicInfoContract basicInfoContract = stateCreationDependencies3.c;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$0 = freshWithProof;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$2 = stateCreationDependencies3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$3 = superPassPurchaseStopsInfo;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$4 = superPassUserDetailsK;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.label = 1;
            Object objC = basicInfoContract.c(superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1);
            if (objC != obj) {
                freshWithProof2 = freshWithProof;
                superPassUserDetails = superPassUserDetailsK;
                superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo;
                objA = objC;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            }
            return obj;
        }
        if (i2 == 1) {
            superPassUserDetails = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$4;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo4 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$3;
            StateCreationDependencies stateCreationDependencies4 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$2;
            bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$1;
            freshWithProof2 = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$0;
            ResultKt.b(objA);
            superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo4;
            stateCreationDependencies3 = stateCreationDependencies4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.J$0;
            superPassUserDetails2 = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$4;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo5 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$1;
            freshWithProof3 = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$0;
            ResultKt.b(objA);
            j2 = j3;
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo5;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration4;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) objA;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(freshWithProof3.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowFreshPurchase", PassApplicationActionRequired.FRESH, null, null, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel != null, superPassPurchaseStopsInfo3, freshWithProof3.g, list, m(list, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196704);
        long jLongValue = ((Number) objA).longValue();
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$0 = freshWithProof2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$1 = bookableSuperPassConfiguration2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$2 = stateCreationDependencies3;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$3 = superPassPurchaseStopsInfo2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.L$4 = superPassUserDetails;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.J$0 = jLongValue;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.J$1 = -1L;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1.label = 2;
        objA = a(bookableSuperPassConfiguration2, stateCreationDependencies3, superPassPurchaseInitialStateFactoryImpl$createFreshWithProofState$1);
        if (objA != obj) {
            superPassUserDetails2 = superPassUserDetails;
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo2;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
            freshWithProof3 = freshWithProof2;
            j = jLongValue;
            j2 = -1;
            stateCreationDependencies2 = stateCreationDependencies3;
            AgencyAndProofDetails agencyAndProofDetails2 = (AgencyAndProofDetails) objA;
            AgencyInfoAppModel agencyInfoAppModel2 = agencyAndProofDetails2.f8432a;
            List list2 = agencyAndProofDetails2.b;
            return new SuperPassPurchaseSharedState(freshWithProof3.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel2, "flowFreshPurchase", PassApplicationActionRequired.FRESH, null, null, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel2 != null, superPassPurchaseStopsInfo3, freshWithProof3.g, list2, m(list2, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196704);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0138  */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:45:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object e(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof freshWithoutProof, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1 superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1;
        Object objB;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof freshWithoutProof2;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3;
        SuperPassUserDetails superPassUserDetails;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        long jLongValue;
        long j;
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof freshWithoutProof3;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        AgencyInfoAppModel agencyInfoAppModel;
        boolean z;
        StateCreationDependencies stateCreationDependencies3 = stateCreationDependencies;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1) {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1(this, continuationImpl);
        }
        Object objC = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String str = freshWithoutProof.g;
            if (str != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, SuperPassPurchaseStopsInfo.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) objB;
            } else {
                superPassPurchaseStopsInfo = null;
            }
            SuperPassRepository superPassRepository = stateCreationDependencies3.f8433a;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0 = freshWithoutProof;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2 = stateCreationDependencies3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3 = superPassPurchaseStopsInfo;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label = 1;
            Object objI = superPassRepository.i(superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1);
            if (objI != obj) {
                freshWithoutProof2 = freshWithoutProof;
                superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo;
                objC = objI;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            }
            return obj;
        }
        if (i2 == 1) {
            superPassPurchaseStopsInfo2 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3;
            stateCreationDependencies3 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2;
            bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1;
            freshWithoutProof2 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 == 2) {
                SuperPassUserDetails superPassUserDetails2 = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$4;
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo4 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3;
                StateCreationDependencies stateCreationDependencies4 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2;
                BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1;
                freshWithoutProof2 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0;
                ResultKt.b(objC);
                superPassUserDetails = superPassUserDetails2;
                bookableSuperPassConfiguration3 = bookableSuperPassConfiguration4;
                superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo4;
                stateCreationDependencies3 = stateCreationDependencies4;
                jLongValue = ((Number) objC).longValue();
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0 = freshWithoutProof2;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1 = bookableSuperPassConfiguration3;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2 = stateCreationDependencies3;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3 = superPassPurchaseStopsInfo3;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$4 = superPassUserDetails;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.J$0 = jLongValue;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.J$1 = -1L;
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label = 3;
                objC = a(bookableSuperPassConfiguration3, stateCreationDependencies3, superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1);
                if (objC != obj) {
                    j = jLongValue;
                    freshWithoutProof3 = freshWithoutProof2;
                    j2 = -1;
                    stateCreationDependencies2 = stateCreationDependencies3;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.J$0;
            superPassUserDetails = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$4;
            superPassPurchaseStopsInfo3 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2;
            bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1;
            freshWithoutProof3 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0;
            ResultKt.b(objC);
            j2 = j3;
        }
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo5 = superPassPurchaseStopsInfo3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration5 = bookableSuperPassConfiguration3;
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) objC;
        agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        Source source = freshWithoutProof3.d;
        CityAppModel cityAppModel = (CityAppModel) stateCreationDependencies2.d.getE().getValue();
        PassApplicationActionRequired passApplicationActionRequired = PassApplicationActionRequired.FRESH;
        Long l = new Long(j);
        if (agencyInfoAppModel != null) {
            z = true;
        } else {
            z = false;
        }
        return new SuperPassPurchaseSharedState(source, cityAppModel, agencyInfoAppModel, "flowFreshPurchaseWithoutProofRequirement", passApplicationActionRequired, null, null, superPassUserDetails, bookableSuperPassConfiguration5, l, j2, z, superPassPurchaseStopsInfo5, freshWithoutProof3.h, list, m(list, null, null, superPassUserDetails.g, stateCreationDependencies2), null, 196704);
        SuperPassUserDetails superPassUserDetails3 = (SuperPassUserDetails) CollectionsKt.L(0, (List) objC);
        SuperPassUserDetails superPassUserDetails4 = superPassUserDetails3 != null ? new SuperPassUserDetails(superPassUserDetails3.f9580a, superPassUserDetails3.b, superPassUserDetails3.c, superPassUserDetails3.d, superPassUserDetails3.e, superPassUserDetails3.f, superPassUserDetails3.g, superPassUserDetails3.a(stateCreationDependencies3.b)) : k(stateCreationDependencies3.f, stateCreationDependencies3.b);
        BasicInfoContract basicInfoContract = stateCreationDependencies3.c;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0 = freshWithoutProof2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1 = bookableSuperPassConfiguration2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2 = stateCreationDependencies3;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3 = superPassPurchaseStopsInfo2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$4 = superPassUserDetails4;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label = 2;
        objC = basicInfoContract.c(superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1);
        if (objC != obj) {
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo2;
            superPassUserDetails = superPassUserDetails4;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
            jLongValue = ((Number) objC).longValue();
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$0 = freshWithoutProof2;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$1 = bookableSuperPassConfiguration3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$2 = stateCreationDependencies3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$3 = superPassPurchaseStopsInfo3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.L$4 = superPassUserDetails;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.J$0 = jLongValue;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.J$1 = -1L;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1.label = 3;
            objC = a(bookableSuperPassConfiguration3, stateCreationDependencies3, superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofForExistingUserState$1);
            if (objC != obj) {
                j = jLongValue;
                freshWithoutProof3 = freshWithoutProof2;
                j2 = -1;
                stateCreationDependencies2 = stateCreationDependencies3;
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo6 = superPassPurchaseStopsInfo3;
                BookableSuperPassConfiguration bookableSuperPassConfiguration6 = bookableSuperPassConfiguration3;
                AgencyAndProofDetails agencyAndProofDetails2 = (AgencyAndProofDetails) objC;
                agencyInfoAppModel = agencyAndProofDetails2.f8432a;
                List list2 = agencyAndProofDetails2.b;
                Source source2 = freshWithoutProof3.d;
                CityAppModel cityAppModel2 = (CityAppModel) stateCreationDependencies2.d.getE().getValue();
                PassApplicationActionRequired passApplicationActionRequired2 = PassApplicationActionRequired.FRESH;
                Long l2 = new Long(j);
                if (agencyInfoAppModel != null) {
                    z = true;
                } else {
                    z = false;
                }
                return new SuperPassPurchaseSharedState(source2, cityAppModel2, agencyInfoAppModel, "flowFreshPurchaseWithoutProofRequirement", passApplicationActionRequired2, null, null, superPassUserDetails, bookableSuperPassConfiguration6, l2, j2, z, superPassPurchaseStopsInfo6, freshWithoutProof3.h, list2, m(list2, null, null, superPassUserDetails.g, stateCreationDependencies2), null, 196704);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object f(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof freshWithoutProof, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1 superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1;
        Object objB;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof freshWithoutProof2;
        SuperPassUserDetails superPassUserDetails;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassUserDetails superPassUserDetails2;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof freshWithoutProof3;
        long j;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        StateCreationDependencies stateCreationDependencies3 = stateCreationDependencies;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1) {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1(this, continuationImpl);
        }
        Object objA = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str = freshWithoutProof.f;
            if (str != null) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, SuperPassPurchaseStopsInfo.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) objB;
            } else {
                superPassPurchaseStopsInfo = null;
            }
            SuperPassUserDetails superPassUserDetailsK = k(stateCreationDependencies3.f, stateCreationDependencies3.b);
            BasicInfoContract basicInfoContract = stateCreationDependencies3.c;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$0 = freshWithoutProof;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$2 = stateCreationDependencies3;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$3 = superPassPurchaseStopsInfo;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$4 = superPassUserDetailsK;
            superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.label = 1;
            Object objC = basicInfoContract.c(superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1);
            if (objC != obj) {
                freshWithoutProof2 = freshWithoutProof;
                superPassUserDetails = superPassUserDetailsK;
                superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo;
                objA = objC;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            }
            return obj;
        }
        if (i2 == 1) {
            superPassUserDetails = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$4;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo4 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$3;
            StateCreationDependencies stateCreationDependencies4 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$2;
            bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$1;
            freshWithoutProof2 = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$0;
            ResultKt.b(objA);
            superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo4;
            stateCreationDependencies3 = stateCreationDependencies4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.J$0;
            superPassUserDetails2 = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$4;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo5 = (SuperPassPurchaseStopsInfo) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$1;
            freshWithoutProof3 = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof) superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$0;
            ResultKt.b(objA);
            j2 = j3;
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo5;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration4;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) objA;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(freshWithoutProof3.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowFreshPurchaseWithoutProofRequirement", PassApplicationActionRequired.FRESH, null, null, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel != null, superPassPurchaseStopsInfo3, freshWithoutProof3.g, list, m(list, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196704);
        long jLongValue = ((Number) objA).longValue();
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$0 = freshWithoutProof2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$1 = bookableSuperPassConfiguration2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$2 = stateCreationDependencies3;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$3 = superPassPurchaseStopsInfo2;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.L$4 = superPassUserDetails;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.J$0 = jLongValue;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.J$1 = -1L;
        superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1.label = 2;
        objA = a(bookableSuperPassConfiguration2, stateCreationDependencies3, superPassPurchaseInitialStateFactoryImpl$createFreshWithoutProofState$1);
        if (objA != obj) {
            superPassUserDetails2 = superPassUserDetails;
            superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo2;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
            freshWithoutProof3 = freshWithoutProof2;
            j = jLongValue;
            j2 = -1;
            stateCreationDependencies2 = stateCreationDependencies3;
            AgencyAndProofDetails agencyAndProofDetails2 = (AgencyAndProofDetails) objA;
            AgencyInfoAppModel agencyInfoAppModel2 = agencyAndProofDetails2.f8432a;
            List list2 = agencyAndProofDetails2.b;
            return new SuperPassPurchaseSharedState(freshWithoutProof3.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel2, "flowFreshPurchaseWithoutProofRequirement", PassApplicationActionRequired.FRESH, null, null, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel2 != null, superPassPurchaseStopsInfo3, freshWithoutProof3.g, list2, m(list2, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196704);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object g(SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication reapplication, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1 superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1;
        SuperPassUserDetails superPassUserDetailsC;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        PassApplicationRejectionReasons passApplicationRejectionReasons;
        long j;
        PassApplicationActionRequired passApplicationActionRequired;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication reapplication2 = reapplication;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1) {
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1(this, continuationImpl);
        }
        Object obj = superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
            String str = reapplication2.f;
            companion.getClass();
            SuperPassUserDetails superPassUserDetailsB = SuperPassUserDetails.Companion.b(str);
            UserProfileDetailsProvider userProfileDetailsProvider = stateCreationDependencies.f;
            TimeUtilsContract timeUtilsContract = stateCreationDependencies.b;
            UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
            if (userProfileAppModelF != null) {
                companion.getClass();
                superPassUserDetailsC = SuperPassUserDetails.Companion.c(userProfileAppModelF, superPassUserDetailsB, timeUtilsContract);
            } else {
                superPassUserDetailsC = superPassUserDetailsB;
            }
            PassApplicationRejectionReasons.Companion companion2 = PassApplicationRejectionReasons.INSTANCE;
            String lPassApplicationRejectionReasonsString = reapplication2.h;
            companion2.getClass();
            Intrinsics.i(lPassApplicationRejectionReasonsString, "lPassApplicationRejectionReasonsString");
            Json json = ChaloJson.b;
            json.getClass();
            PassApplicationRejectionReasons passApplicationRejectionReasons2 = (PassApplicationRejectionReasons) json.b(lPassApplicationRejectionReasonsString, companion2.serializer());
            PassApplicationActionRequired.Companion companion3 = PassApplicationActionRequired.INSTANCE;
            String lPassApplicationActionRequiredString = reapplication2.g;
            companion3.getClass();
            Intrinsics.i(lPassApplicationActionRequiredString, "lPassApplicationActionRequiredString");
            json.getClass();
            PassApplicationActionRequired passApplicationActionRequired2 = (PassApplicationActionRequired) json.b(lPassApplicationActionRequiredString, companion3.serializer());
            long j3 = reapplication2.i;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$0 = reapplication2;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$2 = stateCreationDependencies;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$3 = superPassUserDetailsC;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$4 = passApplicationRejectionReasons2;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$5 = passApplicationActionRequired2;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.J$0 = j3;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.J$1 = -1L;
            superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.label = 1;
            Object objA = a(bookableSuperPassConfiguration, stateCreationDependencies, superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1);
            if (objA == obj2) {
                return obj2;
            }
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            passApplicationRejectionReasons = passApplicationRejectionReasons2;
            obj = objA;
            j = -1;
            passApplicationActionRequired = passApplicationActionRequired2;
            j2 = j3;
            stateCreationDependencies2 = stateCreationDependencies;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.J$1;
            j2 = superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.J$0;
            PassApplicationActionRequired passApplicationActionRequired3 = (PassApplicationActionRequired) superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$5;
            PassApplicationRejectionReasons passApplicationRejectionReasons3 = (PassApplicationRejectionReasons) superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$4;
            superPassUserDetailsC = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$1;
            SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication reapplication3 = (SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication) superPassPurchaseInitialStateFactoryImpl$createPassReapplicationState$1.L$0;
            ResultKt.b(obj);
            j = j4;
            passApplicationActionRequired = passApplicationActionRequired3;
            reapplication2 = reapplication3;
            passApplicationRejectionReasons = passApplicationRejectionReasons3;
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration3;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) obj;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(reapplication2.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowReapplication", passApplicationActionRequired, passApplicationRejectionReasons, null, superPassUserDetailsC, bookableSuperPassConfiguration2, new Long(j2), j, agencyInfoAppModel != null, null, PostPassPurchaseSuccessFlowType.ACTIVATION, list, m(list, passApplicationRejectionReasons, null, superPassUserDetailsC.g, stateCreationDependencies2), null, 196672);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object h(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification paymentModeChangedNoVerification, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1 superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1;
        SuperPassUserDetails superPassUserDetailsC;
        Object objB;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        long j;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        Map map;
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification paymentModeChangedNoVerification2 = paymentModeChangedNoVerification;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1) {
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1(this, continuationImpl);
        }
        Object obj = superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
            String str = paymentModeChangedNoVerification2.f;
            companion.getClass();
            SuperPassUserDetails superPassUserDetailsB = SuperPassUserDetails.Companion.b(str);
            UserProfileDetailsProvider userProfileDetailsProvider = stateCreationDependencies.f;
            TimeUtilsContract timeUtilsContract = stateCreationDependencies.b;
            UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
            if (userProfileAppModelF != null) {
                companion.getClass();
                superPassUserDetailsC = SuperPassUserDetails.Companion.c(userProfileAppModelF, superPassUserDetailsB, timeUtilsContract);
            } else {
                superPassUserDetailsC = superPassUserDetailsB;
            }
            String str2 = paymentModeChangedNoVerification2.h;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(new LinkedHashMapSerializer(StringSerializer.f18170a, SuperPassProofProperties.INSTANCE.serializer())));
            } catch (Exception unused) {
                objB = null;
            }
            Map map2 = (Map) objB;
            long j3 = paymentModeChangedNoVerification2.g;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$0 = paymentModeChangedNoVerification2;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$2 = stateCreationDependencies;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$3 = superPassUserDetailsC;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$4 = map2;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.J$0 = j3;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.J$1 = -1L;
            superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.label = 1;
            Object objA = a(bookableSuperPassConfiguration, stateCreationDependencies, superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1);
            if (objA == obj2) {
                return obj2;
            }
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            j = j3;
            j2 = -1;
            stateCreationDependencies2 = stateCreationDependencies;
            map = map2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.J$0;
            map = (Map) superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$4;
            superPassUserDetailsC = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$1;
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification paymentModeChangedNoVerification3 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) superPassPurchaseInitialStateFactoryImpl$createPaymentModeChangedNoVerificationState$1.L$0;
            ResultKt.b(obj);
            j2 = j4;
            paymentModeChangedNoVerification2 = paymentModeChangedNoVerification3;
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration3;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) obj;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(paymentModeChangedNoVerification2.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowPaymentModeChangedNoVerification", PassApplicationActionRequired.FRESH, null, null, superPassUserDetailsC, bookableSuperPassConfiguration2, new Long(j), j2, agencyInfoAppModel != null, null, PostPassPurchaseSuccessFlowType.ACTIVATION, list, m(list, null, map, superPassUserDetailsC.g, stateCreationDependencies2), map, 131168);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object i(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification paymentPostVerification, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1 superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1;
        SuperPassUserDetails superPassUserDetailsC;
        Object objA;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        long j;
        long j2;
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification paymentPostVerification2 = paymentPostVerification;
        StateCreationDependencies stateCreationDependencies2 = stateCreationDependencies;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1) {
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1(this, continuationImpl);
        }
        Object obj = superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
            String str = paymentPostVerification2.f;
            companion.getClass();
            SuperPassUserDetails superPassUserDetailsB = SuperPassUserDetails.Companion.b(str);
            UserProfileDetailsProvider userProfileDetailsProvider = stateCreationDependencies2.f;
            TimeUtilsContract timeUtilsContract = stateCreationDependencies2.b;
            UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
            if (userProfileAppModelF != null) {
                companion.getClass();
                superPassUserDetailsC = SuperPassUserDetails.Companion.c(userProfileAppModelF, superPassUserDetailsB, timeUtilsContract);
            } else {
                superPassUserDetailsC = superPassUserDetailsB;
            }
            long j3 = paymentPostVerification2.h;
            long j4 = paymentPostVerification2.g;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$0 = paymentPostVerification2;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$2 = stateCreationDependencies2;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$3 = superPassUserDetailsC;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.J$0 = j3;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.J$1 = j4;
            superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.label = 1;
            objA = a(bookableSuperPassConfiguration, stateCreationDependencies2, superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1);
            if (objA == obj2) {
                return obj2;
            }
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            j = j3;
            j2 = j4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.J$0;
            SuperPassUserDetails superPassUserDetails = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$3;
            StateCreationDependencies stateCreationDependencies3 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration3 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$1;
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification paymentPostVerification3 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) superPassPurchaseInitialStateFactoryImpl$createPaymentPostVerificationState$1.L$0;
            ResultKt.b(obj);
            j2 = j5;
            paymentPostVerification2 = paymentPostVerification3;
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration3;
            objA = obj;
            superPassUserDetailsC = superPassUserDetails;
            stateCreationDependencies2 = stateCreationDependencies3;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) objA;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(paymentPostVerification2.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowPaymentPostVerification", PassApplicationActionRequired.FRESH, null, null, superPassUserDetailsC, bookableSuperPassConfiguration2, new Long(j), j2, agencyInfoAppModel != null, null, PostPassPurchaseSuccessFlowType.ACTIVATION, list, m(list, null, null, superPassUserDetailsC.g, stateCreationDependencies2), null, 196704);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object j(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew renew, BookableSuperPassConfiguration bookableSuperPassConfiguration, StateCreationDependencies stateCreationDependencies, ContinuationImpl continuationImpl) {
        SuperPassPurchaseInitialStateFactoryImpl$createRenewState$1 superPassPurchaseInitialStateFactoryImpl$createRenewState$1;
        SuperPassUserDetails superPassUserDetails;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew renew2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3;
        SuperPassUserDetails superPassUserDetails2;
        long j;
        long j2;
        StateCreationDependencies stateCreationDependencies2;
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew renew3 = renew;
        StateCreationDependencies stateCreationDependencies3 = stateCreationDependencies;
        if (continuationImpl instanceof SuperPassPurchaseInitialStateFactoryImpl$createRenewState$1) {
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1 = (SuperPassPurchaseInitialStateFactoryImpl$createRenewState$1) continuationImpl;
            int i = superPassPurchaseInitialStateFactoryImpl$createRenewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseInitialStateFactoryImpl$createRenewState$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseInitialStateFactoryImpl$createRenewState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createRenewState$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1 = new SuperPassPurchaseInitialStateFactoryImpl$createRenewState$1(this, continuationImpl);
        }
        Object objC = superPassPurchaseInitialStateFactoryImpl$createRenewState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseInitialStateFactoryImpl$createRenewState$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
            String str = renew3.f;
            companion.getClass();
            SuperPassUserDetails superPassUserDetailsB = SuperPassUserDetails.Companion.b(str);
            UserProfileDetailsProvider userProfileDetailsProvider = stateCreationDependencies3.f;
            TimeUtilsContract timeUtilsContract = stateCreationDependencies3.b;
            UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
            if (userProfileAppModelF != null) {
                companion.getClass();
                superPassUserDetailsB = SuperPassUserDetails.Companion.c(userProfileAppModelF, superPassUserDetailsB, timeUtilsContract);
            }
            BasicInfoContract basicInfoContract = stateCreationDependencies3.c;
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$0 = renew3;
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$1 = bookableSuperPassConfiguration;
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$2 = stateCreationDependencies3;
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$3 = superPassUserDetailsB;
            superPassPurchaseInitialStateFactoryImpl$createRenewState$1.label = 1;
            objC = basicInfoContract.c(superPassPurchaseInitialStateFactoryImpl$createRenewState$1);
            if (objC != obj) {
                superPassUserDetails = superPassUserDetailsB;
                bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            }
            return obj;
        }
        if (i2 == 1) {
            SuperPassUserDetails superPassUserDetails3 = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$3;
            stateCreationDependencies3 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$2;
            bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$1;
            SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew renew4 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$0;
            ResultKt.b(objC);
            superPassUserDetails = superPassUserDetails3;
            renew3 = renew4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = superPassPurchaseInitialStateFactoryImpl$createRenewState$1.J$1;
            j = superPassPurchaseInitialStateFactoryImpl$createRenewState$1.J$0;
            superPassUserDetails2 = (SuperPassUserDetails) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$3;
            stateCreationDependencies2 = (StateCreationDependencies) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$2;
            BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$1;
            renew2 = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$0;
            ResultKt.b(objC);
            j2 = j3;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration4;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) objC;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        List list = agencyAndProofDetails.b;
        return new SuperPassPurchaseSharedState(renew2.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel, "flowRenewPass", PassApplicationActionRequired.FRESH, null, renew2.g, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel != null, null, PostPassPurchaseSuccessFlowType.ACTIVATION, list, m(list, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196640);
        long jLongValue = ((Number) objC).longValue();
        long j4 = renew3.h;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$0 = renew3;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$1 = bookableSuperPassConfiguration2;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$2 = stateCreationDependencies3;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.L$3 = superPassUserDetails;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.J$0 = jLongValue;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.J$1 = j4;
        superPassPurchaseInitialStateFactoryImpl$createRenewState$1.label = 2;
        objC = a(bookableSuperPassConfiguration2, stateCreationDependencies3, superPassPurchaseInitialStateFactoryImpl$createRenewState$1);
        if (objC != obj) {
            renew2 = renew3;
            bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
            superPassUserDetails2 = superPassUserDetails;
            j = jLongValue;
            j2 = j4;
            stateCreationDependencies2 = stateCreationDependencies3;
            AgencyAndProofDetails agencyAndProofDetails2 = (AgencyAndProofDetails) objC;
            AgencyInfoAppModel agencyInfoAppModel2 = agencyAndProofDetails2.f8432a;
            List list2 = agencyAndProofDetails2.b;
            return new SuperPassPurchaseSharedState(renew2.d, (CityAppModel) stateCreationDependencies2.d.getE().getValue(), agencyInfoAppModel2, "flowRenewPass", PassApplicationActionRequired.FRESH, null, renew2.g, superPassUserDetails2, bookableSuperPassConfiguration3, new Long(j), j2, agencyInfoAppModel2 != null, null, PostPassPurchaseSuccessFlowType.ACTIVATION, list2, m(list2, null, null, superPassUserDetails2.g, stateCreationDependencies2), null, 196640);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:12:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(java.util.List r8, java.lang.String r9, app.chalo.productpurchase.passpurchase.ui.factory.StateCreationDependencies r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl$getDefaultDocumentPropsList$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl$getDefaultDocumentPropsList$1 r0 = (app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl$getDefaultDocumentPropsList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl$getDefaultDocumentPropsList$1 r0 = new app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl$getDefaultDocumentPropsList$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r8 = r0.L$4
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$2
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.L$1
            app.chalo.productpurchase.passpurchase.ui.factory.StateCreationDependencies r2 = (app.chalo.productpurchase.passpurchase.ui.factory.StateCreationDependencies) r2
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.b(r11)
            r6 = r0
            r0 = r10
            r10 = r4
        L3d:
            r4 = r6
            goto L9a
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L47:
            java.util.ArrayList r11 = defpackage.py.l(r11)
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto La5
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L57
            goto La5
        L57:
            app.chalo.providers.cityprovider.CityProvider r2 = r10.d
            java.lang.String r2 = app.chalo.providers.cityprovider.CityProviderKt.b(r2)
            if (r2 == 0) goto La5
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r2, r4)
            java.util.Iterator r8 = r8.iterator()
            r6 = r10
            r10 = r9
            r9 = r2
            r2 = r0
            r0 = r11
            r11 = r6
        L75:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r8.next()
            java.lang.String r4 = (java.lang.String) r4
            app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository r5 = r11.e
            r2.L$0 = r10
            r2.L$1 = r11
            r2.L$2 = r0
            r2.L$3 = r9
            r2.L$4 = r8
            r2.label = r3
            java.lang.Object r4 = r5.d(r9, r10, r4, r2)
            if (r4 != r1) goto L96
            return r1
        L96:
            r6 = r2
            r2 = r11
            r11 = r4
            goto L3d
        L9a:
            app.chalo.superpass.data.models.app.ProofDocumentProps r11 = (app.chalo.superpass.data.models.app.ProofDocumentProps) r11
            if (r11 == 0) goto La1
            r0.add(r11)
        La1:
            r11 = r2
            r2 = r4
            goto L75
        La4:
            return r0
        La5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactoryImpl.l(java.util.List, java.lang.String, app.chalo.productpurchase.passpurchase.ui.factory.StateCreationDependencies, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
