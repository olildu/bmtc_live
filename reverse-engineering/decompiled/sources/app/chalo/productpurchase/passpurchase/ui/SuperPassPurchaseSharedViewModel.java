package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.fileupload.domain.UploadFileToServerUseCase;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.productpurchase.passpurchase.data.ProfilePhotoProofPrefillHelperKt;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetailsSerializable;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassConfirmationManager;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassUserDetailsManager;
import app.chalo.productpurchase.passpurchase.ui.factory.AgencyAndProofDetails;
import app.chalo.productpurchase.passpurchase.ui.factory.StateCreationDependencies;
import app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactory;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionManager;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofUploadManager;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
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
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.g41;
import defpackage.g61;
import defpackage.gg1;
import defpackage.l91;
import defpackage.mb1;
import defpackage.q60;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedViewModel;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedState;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedEffect;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseBaseManager;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassUserDetailsManager;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionManager;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassProofUploadManager;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/SuperPassConfirmationManager;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassPurchaseSharedViewModel extends ChaloBaseStateMviComponent<SuperPassPurchaseSharedIntent, SuperPassPurchaseSharedState, SuperPassPurchaseSharedState, SuperPassPurchaseSharedEffect> implements SuperPassPurchaseBaseManager, SuperPassUserDetailsManager, SuperPassPassengerSelectionManager, SuperPassProofUploadManager, SuperPassConfirmationManager {
    public static final Set G = ArraysKt.j0(new String[]{"flowFreshPurchase", "flowFreshPurchaseWithoutProofRequirement", "flowRenewPass"});
    public final StringProvider A;
    public final GetPremiumPassExpiryEligibilityForPurchaseUseCase B;
    public final Lazy C;
    public final Lazy D;
    public final MutableStateFlow E;
    public final StateFlow F;
    public final SuperPassPurchaseArgs k;
    public final SuperPassPurchaseInitialStateFactory l;
    public final ChaloNavigationManager m;
    public final SuperPassRepository n;
    public final TimeUtilsContract o;
    public final BasicInfoContract p;
    public final CityProvider q;
    public final ProductPurchaseRepository r;
    public final UserProfileDetailsProvider s;
    public final IReportProblemFeature t;
    public final AnalyticsContract u;
    public final CrashlyticsLogger v;
    public final UploadFileToServerUseCase w;
    public final SystemHelper x;
    public final CoroutineContextProvider y;
    public final KotlinToastManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedViewModel$Companion;", "", "", "SUPER_PASS_PURCHASE_SHARED_STATE_KEEPER_KEY", "Ljava/lang/String;", "", "freshOrRenewFlowTypes", "Ljava/util/Set;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SuperPassPurchaseSharedViewModel(SuperPassPurchaseArgs superPassPurchaseArgs, ComponentContext componentContext, SuperPassPurchaseInitialStateFactory superPassPurchaseInitialStateFactory, ChaloNavigationManager chaloNavigationManager, SuperPassRepository superPassRepository, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, CityProvider cityProvider, ProductPurchaseRepository productPurchaseRepository, UserProfileDetailsProvider userProfileDetailsProvider, IReportProblemFeature iReportProblemFeature, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, UploadFileToServerUseCase uploadFileToServerUseCase, SystemHelper systemHelper, CoroutineContextProvider coroutineContextProvider, KotlinToastManager kotlinToastManager, StringProvider stringProvider, GetPremiumPassExpiryEligibilityForPurchaseUseCase getPremiumPassExpiryEligibilityForPurchaseUseCase) {
        super(componentContext);
        this.k = superPassPurchaseArgs;
        this.l = superPassPurchaseInitialStateFactory;
        this.m = chaloNavigationManager;
        this.n = superPassRepository;
        this.o = timeUtilsContract;
        this.p = basicInfoContract;
        this.q = cityProvider;
        this.r = productPurchaseRepository;
        this.s = userProfileDetailsProvider;
        this.t = iReportProblemFeature;
        this.u = analyticsContract;
        this.v = crashlyticsLogger;
        this.w = uploadFileToServerUseCase;
        this.x = systemHelper;
        this.y = coroutineContextProvider;
        this.z = kotlinToastManager;
        this.A = stringProvider;
        this.B = getPremiumPassExpiryEligibilityForPurchaseUseCase;
        this.C = LazyKt.b(new gg1(26));
        this.D = LazyKt.b(new gg1(27));
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new SuperPassPurchaseSharedState(null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, null, null, null, 262143));
        this.E = mutableStateFlowA;
        this.F = mutableStateFlowA;
        componentContext.getB().d("super_pass_purchase_shared_state_keeper_key", SuperPassPurchaseSharedRestoredState.INSTANCE.serializer(), new g61(this, 22));
        t0().b(new l91(this, 24));
        G0(new SuperPassPurchaseSharedIntent.InitializationIntent(superPassPurchaseArgs));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionManager
    public final void D(String passId, long j, SuperPassUserDetails superPassUserDetails) {
        Intrinsics.i(passId, "passId");
        G0(new SuperPassPurchaseSharedIntent.ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent(passId, j, superPassUserDetails));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionManager
    public final void F(SuperPassUserDetails superPassUserDetails) {
        G0(new SuperPassPurchaseSharedIntent.SaveUserDetailsFromSmartPassengerSelectionIntent(superPassUserDetails));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    public final HashMap F0(List list, PassApplicationRejectionReasons passApplicationRejectionReasons, Map map, String str) {
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
            try {
                for (Map.Entry entry : map.entrySet()) {
                    map2.put((String) entry.getKey(), new ProofUploadDetails(((SuperPassProofProperties) entry.getValue()).b, (BitmapImage) null, "", ProofUploadStatus.UPLOAD_SUCCESSFUL, false));
                }
            } catch (Exception e) {
                this.v.i(e);
            }
        }
        String str2 = null;
        if (str == null || StringsKt.F(str)) {
            str = null;
        }
        UserProfileAppModel userProfileAppModelF = this.s.f();
        if (userProfileAppModelF != null) {
            String str3 = userProfileAppModelF.c;
            if (!StringsKt.F(str3)) {
                str2 = str3;
            }
        }
        if (str == null) {
            str = str2;
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
        ProfilePhotoProofPrefillHelperKt.a(list, map2, str, setG0);
        return map2;
    }

    public final void G0(SuperPassPurchaseSharedIntent superPassPurchaseSharedIntent) {
        C0(superPassPurchaseSharedIntent);
        boolean z = superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new SuperPassPurchaseSharedViewModel$handleInitializationIntent$1(this, (SuperPassPurchaseSharedIntent.InitializationIntent) superPassPurchaseSharedIntent, null), 3);
            return;
        }
        if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.UpdateUserDetailsAndStartTime) {
            E0(new l91((SuperPassPurchaseSharedIntent.UpdateUserDetailsAndStartTime) superPassPurchaseSharedIntent, 23));
            return;
        }
        if (superPassPurchaseSharedIntent.equals(SuperPassPurchaseSharedIntent.ReportProblemClickedIntent.f8349a)) {
            BuildersKt.d(contextScope, null, null, new SuperPassPurchaseSharedViewModel$handleReportProblemClickedIntent$1(this, null), 3);
            return;
        }
        if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.UpdateUploadProofsFromPreviousValidUploads) {
            SuperPassPurchaseSharedIntent.UpdateUploadProofsFromPreviousValidUploads updateUploadProofsFromPreviousValidUploads = (SuperPassPurchaseSharedIntent.UpdateUploadProofsFromPreviousValidUploads) superPassPurchaseSharedIntent;
            SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) t0().a();
            LinkedHashMap linkedHashMapU = MapsKt.u(F0(superPassPurchaseSharedState.o, superPassPurchaseSharedState.f, superPassPurchaseSharedState.q, superPassPurchaseSharedState.h.g));
            for (String str : linkedHashMapU.keySet()) {
                ProofUploadDetails proofUploadDetails = (ProofUploadDetails) updateUploadProofsFromPreviousValidUploads.f8353a.get(str);
                if (proofUploadDetails != null) {
                    linkedHashMapU.put(str, proofUploadDetails);
                }
            }
            E0(new q60(linkedHashMapU, 6));
            return;
        }
        if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.CancelProofUploadIntent) {
            BuildersKt.d(contextScope, null, null, new SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1(this, (SuperPassPurchaseSharedIntent.CancelProofUploadIntent) superPassPurchaseSharedIntent, null), 3);
            return;
        }
        if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.UploadProofImageIntent) {
            BuildersKt.d(contextScope, null, null, new SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1(this, (SuperPassPurchaseSharedIntent.UploadProofImageIntent) superPassPurchaseSharedIntent, null), 3);
            return;
        }
        if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.UpdateUserName) {
            E0(new l91((SuperPassPurchaseSharedIntent.UpdateUserName) superPassPurchaseSharedIntent, 21));
            return;
        }
        if (superPassPurchaseSharedIntent.equals(SuperPassPurchaseSharedIntent.SetupUserDetailsForNewPassengerIntent.f8351a)) {
            E0(new mb1(27));
            return;
        }
        if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent) {
            E0(new g41(25, (SuperPassPurchaseSharedIntent.ConvertFreshBookingToRenewFlowOnSmartPassengerSelectionIntent) superPassPurchaseSharedIntent, this));
        } else if (superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.SaveUserDetailsFromSmartPassengerSelectionIntent) {
            E0(new g41(26, (SuperPassPurchaseSharedIntent.SaveUserDetailsFromSmartPassengerSelectionIntent) superPassPurchaseSharedIntent, this));
        } else {
            if (!(superPassPurchaseSharedIntent instanceof SuperPassPurchaseSharedIntent.UpdatePassStartTimeIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new l91((SuperPassPurchaseSharedIntent.UpdatePassStartTimeIntent) superPassPurchaseSharedIntent, 22));
        }
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassUserDetailsManager
    public final void J(Map proofUploadDetailsMap) {
        Intrinsics.i(proofUploadDetailsMap, "proofUploadDetailsMap");
        G0(new SuperPassPurchaseSharedIntent.UpdateUploadProofsFromPreviousValidUploads(proofUploadDetailsMap));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassUserDetailsManager
    public final void Q(String fullName, Gender gender, String dateOfBirth, long j, long j2) {
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(dateOfBirth, "dateOfBirth");
        G0(new SuperPassPurchaseSharedIntent.UpdateUserDetailsAndStartTime(fullName, gender, dateOfBirth, j, j2));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassConfirmationManager
    public final void S(long j) {
        G0(new SuperPassPurchaseSharedIntent.UpdatePassStartTimeIntent(j));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionManager
    public final void W() {
        G0(SuperPassPurchaseSharedIntent.SetupUserDetailsForNewPassengerIntent.f8351a);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseBaseManager
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getF() {
        return this.F;
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseBaseManager
    public final void m() {
        G0(SuperPassPurchaseSharedIntent.ReportProblemClickedIntent.f8349a);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofUploadManager
    public final void o(String id, BitmapImage bitmapImage, String str) {
        Intrinsics.i(id, "id");
        G0(new SuperPassPurchaseSharedIntent.UploadProofImageIntent(id, bitmapImage, str));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofUploadManager
    public final void p(String name) {
        Intrinsics.i(name, "name");
        G0(new SuperPassPurchaseSharedIntent.UpdateUserName(name));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (SuperPassPurchaseSharedState) obj;
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofUploadManager
    public final void r(String proofId) {
        Intrinsics.i(proofId, "proofId");
        G0(new SuperPassPurchaseSharedIntent.CancelProofUploadIntent(proofId));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        Source source;
        LinkedHashMap linkedHashMap;
        SuperPassPurchaseSharedRestoredState superPassPurchaseSharedRestoredState = (SuperPassPurchaseSharedRestoredState) this.f5983a.getB().a("super_pass_purchase_shared_state_keeper_key", SuperPassPurchaseSharedRestoredState.INSTANCE.serializer());
        if (superPassPurchaseSharedRestoredState == null) {
            return new SuperPassPurchaseSharedState(null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, null, null, null, 262143);
        }
        SuperPassPurchaseSharedState superPassPurchaseSharedState = SuperPassPurchaseSharedContractKt.f8345a;
        Source source2 = superPassPurchaseSharedRestoredState.f8357a;
        AgencyInfoAppModel agencyInfoAppModel = superPassPurchaseSharedRestoredState.b;
        String str = superPassPurchaseSharedRestoredState.c;
        PassApplicationActionRequired passApplicationActionRequired = superPassPurchaseSharedRestoredState.d;
        PassApplicationRejectionReasons passApplicationRejectionReasons = superPassPurchaseSharedRestoredState.e;
        String str2 = superPassPurchaseSharedRestoredState.f;
        SuperPassUserDetails superPassUserDetails = superPassPurchaseSharedRestoredState.g;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedRestoredState.h;
        Long l = superPassPurchaseSharedRestoredState.i;
        long j = superPassPurchaseSharedRestoredState.j;
        boolean z = superPassPurchaseSharedRestoredState.k;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2 = superPassPurchaseSharedRestoredState.l;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType = superPassPurchaseSharedRestoredState.m;
        List list = superPassPurchaseSharedRestoredState.n;
        Map map = superPassPurchaseSharedRestoredState.o;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Iterator it2 = it;
                Object key = entry.getKey();
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3 = superPassPurchaseStopsInfo2;
                ProofUploadDetailsSerializable proofUploadDetailsSerializable = (ProofUploadDetailsSerializable) entry.getValue();
                Intrinsics.i(proofUploadDetailsSerializable, "<this>");
                linkedHashMap.put(key, new ProofUploadDetails(proofUploadDetailsSerializable.f8318a, (BitmapImage) null, proofUploadDetailsSerializable.b, proofUploadDetailsSerializable.c, proofUploadDetailsSerializable.d));
                source2 = source2;
                it = it2;
                superPassPurchaseStopsInfo2 = superPassPurchaseStopsInfo3;
            }
            superPassPurchaseStopsInfo = superPassPurchaseStopsInfo2;
            source = source2;
        } else {
            superPassPurchaseStopsInfo = superPassPurchaseStopsInfo2;
            source = source2;
            linkedHashMap = null;
        }
        return new SuperPassPurchaseSharedState(source, null, agencyInfoAppModel, str, passApplicationActionRequired, passApplicationRejectionReasons, str2, superPassUserDetails, bookableSuperPassConfiguration, l, j, z, superPassPurchaseStopsInfo, postPassPurchaseSuccessFlowType, list, linkedHashMap, superPassPurchaseSharedRestoredState.p, 131074);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new SuperPassPurchaseSharedState(null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, null, null, null, 262143);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassConfirmationManager
    public final Object x(BookableSuperPassConfiguration bookableSuperPassConfiguration, ContinuationImpl continuationImpl) {
        SuperPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1 superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        SuperPassPurchaseSharedState superPassPurchaseSharedState;
        ProofUploadDetails proofUploadDetails;
        if (continuationImpl instanceof SuperPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1) {
            superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1 = (SuperPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1) continuationImpl;
            int i = superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1 = new SuperPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1(this, continuationImpl);
            }
        } else {
            superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1 = new SuperPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1(this, continuationImpl);
        }
        Object obj = superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            SuperPassPurchaseSharedState superPassPurchaseSharedState2 = (SuperPassPurchaseSharedState) this.F.getValue();
            BookableSuperPassConfiguration bookableSuperPassConfiguration3 = superPassPurchaseSharedState2.i;
            if (bookableSuperPassConfiguration3 != null && Intrinsics.d(bookableSuperPassConfiguration3.b.k, bookableSuperPassConfiguration.b.k) && Intrinsics.d(bookableSuperPassConfiguration3.f, bookableSuperPassConfiguration.f)) {
                final SuperPassPurchaseSharedState superPassPurchaseSharedStateA = SuperPassPurchaseSharedState.a(superPassPurchaseSharedState2, null, null, null, null, bookableSuperPassConfiguration, null, 0L, false, null, null, 261887);
                final int i3 = 0;
                E0(new Function1() { // from class: hg1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i4 = i3;
                        SuperPassPurchaseSharedState superPassPurchaseSharedState3 = superPassPurchaseSharedStateA;
                        SuperPassPurchaseSharedState it = (SuperPassPurchaseSharedState) obj2;
                        switch (i4) {
                            case 0:
                                Set set = SuperPassPurchaseSharedViewModel.G;
                                Intrinsics.i(it, "it");
                                break;
                            default:
                                Set set2 = SuperPassPurchaseSharedViewModel.G;
                                Intrinsics.i(it, "it");
                                break;
                        }
                        return superPassPurchaseSharedState3;
                    }
                });
                return superPassPurchaseSharedStateA;
            }
            StateCreationDependencies stateCreationDependencies = new StateCreationDependencies(this.n, this.o, this.p, this.q, this.r, this.s, this.v);
            superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.L$0 = bookableSuperPassConfiguration;
            superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.L$1 = superPassPurchaseSharedState2;
            superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.label = 1;
            Object objA = this.l.a(bookableSuperPassConfiguration, stateCreationDependencies, superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            superPassPurchaseSharedState = superPassPurchaseSharedState2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SuperPassPurchaseSharedState superPassPurchaseSharedState3 = (SuperPassPurchaseSharedState) superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.L$1;
            BookableSuperPassConfiguration bookableSuperPassConfiguration4 = (BookableSuperPassConfiguration) superPassPurchaseSharedViewModel$updateBookableSuperPassConfiguration$1.L$0;
            ResultKt.b(obj);
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration4;
            superPassPurchaseSharedState = superPassPurchaseSharedState3;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) obj;
        AgencyInfoAppModel agencyInfoAppModel = agencyAndProofDetails.f8432a;
        boolean z = agencyInfoAppModel != null;
        List list = agencyAndProofDetails.b;
        Map map = superPassPurchaseSharedState.p;
        List list2 = list;
        int iG = MapsKt.g(CollectionsKt.v(list2, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = ((ProofDocumentProps) it.next()).f9539a;
            if (map == null || (proofUploadDetails = (ProofUploadDetails) map.get(str)) == null) {
                proofUploadDetails = new ProofUploadDetails((String) null, (BitmapImage) null, (String) null, (ProofUploadStatus) null, 31);
            }
            Pair pair = new Pair(str, proofUploadDetails);
            linkedHashMap.put(pair.d(), pair.e());
        }
        final SuperPassPurchaseSharedState superPassPurchaseSharedStateA2 = SuperPassPurchaseSharedState.a(superPassPurchaseSharedState, null, agencyInfoAppModel, null, null, bookableSuperPassConfiguration2, null, 0L, z, list, linkedHashMap, 210683);
        final int i4 = 1;
        E0(new Function1() { // from class: hg1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i5 = i4;
                SuperPassPurchaseSharedState superPassPurchaseSharedState4 = superPassPurchaseSharedStateA2;
                SuperPassPurchaseSharedState it2 = (SuperPassPurchaseSharedState) obj2;
                switch (i5) {
                    case 0:
                        Set set = SuperPassPurchaseSharedViewModel.G;
                        Intrinsics.i(it2, "it");
                        break;
                    default:
                        Set set2 = SuperPassPurchaseSharedViewModel.G;
                        Intrinsics.i(it2, "it");
                        break;
                }
                return superPassPurchaseSharedState4;
            }
        });
        return superPassPurchaseSharedStateA2;
    }
}
