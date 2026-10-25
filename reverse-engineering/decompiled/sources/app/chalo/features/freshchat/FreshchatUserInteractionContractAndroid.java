package app.chalo.features.freshchat;

import android.content.Context;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.usecase.GetDistinctIdUseCase;
import com.freshchat.consumer.sdk.ConversationOptions;
import com.freshchat.consumer.sdk.FaqOptions;
import com.freshchat.consumer.sdk.Freshchat;
import com.freshchat.consumer.sdk.exception.MethodNotAllowedException;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/freshchat/FreshchatUserInteractionContractAndroid;", "Lapp/chalo/features/freshchat/FreshchatUserInteractionContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshchatUserInteractionContractAndroid implements FreshchatUserInteractionContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2721a;
    public final GetDistinctIdUseCase b;
    public final FreshchatUserDataHandler c;
    public final FreshchatRestoreIdDataMigration d;
    public final SdkIntegrationPolicyManager e;

    public FreshchatUserInteractionContractAndroid(Context context, GetDistinctIdUseCase getDistinctIdUseCase, FreshchatUserDataHandler freshchatUserDataHandler, FreshchatRestoreIdDataMigration freshchatRestoreIdDataMigration, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        Intrinsics.i(getDistinctIdUseCase, "getDistinctIdUseCase");
        Intrinsics.i(freshchatUserDataHandler, "freshchatUserDataHandler");
        Intrinsics.i(freshchatRestoreIdDataMigration, "freshchatRestoreIdDataMigration");
        Intrinsics.i(sdkIntegrationPolicyManager, "sdkIntegrationPolicyManager");
        this.f2721a = context;
        this.b = getDistinctIdUseCase;
        this.c = freshchatUserDataHandler;
        this.d = freshchatRestoreIdDataMigration;
        this.e = sdkIntegrationPolicyManager;
    }

    @Override // app.chalo.features.freshchat.FreshchatUserInteractionContract
    public final void a() {
        if (this.e.f1078a.d) {
            Freshchat.showConversations(this.f2721a, new ConversationOptions());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.freshchat.FreshchatUserInteractionContract
    public final Object b(ContinuationImpl continuationImpl) {
        FreshchatUserInteractionContractAndroid$updateUserId$1 freshchatUserInteractionContractAndroid$updateUserId$1;
        String strA;
        String str;
        if (continuationImpl instanceof FreshchatUserInteractionContractAndroid$updateUserId$1) {
            freshchatUserInteractionContractAndroid$updateUserId$1 = (FreshchatUserInteractionContractAndroid$updateUserId$1) continuationImpl;
            int i = freshchatUserInteractionContractAndroid$updateUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                freshchatUserInteractionContractAndroid$updateUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                freshchatUserInteractionContractAndroid$updateUserId$1 = new FreshchatUserInteractionContractAndroid$updateUserId$1(this, continuationImpl);
            }
        } else {
            freshchatUserInteractionContractAndroid$updateUserId$1 = new FreshchatUserInteractionContractAndroid$updateUserId$1(this, continuationImpl);
        }
        Object obj = freshchatUserInteractionContractAndroid$updateUserId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = freshchatUserInteractionContractAndroid$updateUserId$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!this.e.f1078a.d || (strA = this.b.a(false)) == null) {
                return unit;
            }
            freshchatUserInteractionContractAndroid$updateUserId$1.L$0 = strA;
            freshchatUserInteractionContractAndroid$updateUserId$1.label = 1;
            if (this.d.a(freshchatUserInteractionContractAndroid$updateUserId$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str2 = (String) freshchatUserInteractionContractAndroid$updateUserId$1.L$0;
            ResultKt.b(obj);
            strA = str2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) freshchatUserInteractionContractAndroid$updateUserId$1.L$0;
            ResultKt.b(obj);
        }
        String str3 = (String) obj;
        Freshchat freshchat = Freshchat.getInstance(this.f2721a);
        try {
            freshchat.identifyUser(str, str3);
            freshchat.setUser(freshchat.getUser());
            return unit;
        } catch (MethodNotAllowedException e) {
            e.printStackTrace();
            return unit;
        }
        freshchatUserInteractionContractAndroid$updateUserId$1.L$0 = strA;
        freshchatUserInteractionContractAndroid$updateUserId$1.label = 2;
        FreshchatUserDataHandler freshchatUserDataHandler = this.c;
        String strA2 = freshchatUserDataHandler.f2718a.a(false);
        String strConcat = strA2 != null ? strA2.concat("_freshchatRestoreId") : null;
        Object objF = strConcat == null ? null : freshchatUserDataHandler.b.f(strConcat, freshchatUserInteractionContractAndroid$updateUserId$1);
        if (objF != coroutineSingletons) {
            Object obj2 = objF;
            str = strA;
            obj = obj2;
            String str4 = (String) obj;
            Freshchat freshchat2 = Freshchat.getInstance(this.f2721a);
            freshchat2.identifyUser(str, str4);
            freshchat2.setUser(freshchat2.getUser());
            return unit;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.features.freshchat.FreshchatUserInteractionContract
    public final void c(List tagList, boolean z, String str, String str2) {
        Intrinsics.i(tagList, "tagList");
        if (this.e.f1078a.d) {
            boolean zEqualsIgnoreCase = str2.equalsIgnoreCase("category");
            Context context = this.f2721a;
            if (zEqualsIgnoreCase) {
                FaqOptions faqOptionsShowFaqCategoriesAsGrid = new FaqOptions().filterByTags(tagList, str, FaqOptions.FilterType.CATEGORY).showFaqCategoriesAsGrid(false);
                if (!z) {
                    faqOptionsShowFaqCategoriesAsGrid.showContactUsOnFaqNotHelpful(false).showContactUsOnAppBar(false).showContactUsOnFaqScreens(false);
                }
                Freshchat.showFAQs(context, faqOptionsShowFaqCategoriesAsGrid);
                return;
            }
            if (str2.equalsIgnoreCase("article")) {
                FaqOptions faqOptionsShowFaqCategoriesAsGrid2 = new FaqOptions().filterByTags(tagList, str, FaqOptions.FilterType.ARTICLE).showFaqCategoriesAsGrid(false);
                if (!z) {
                    faqOptionsShowFaqCategoriesAsGrid2.showContactUsOnFaqNotHelpful(false).showContactUsOnAppBar(false).showContactUsOnFaqScreens(false);
                }
                Freshchat.showFAQs(context, faqOptionsShowFaqCategoriesAsGrid2);
            }
        }
    }

    @Override // app.chalo.features.freshchat.FreshchatUserInteractionContract
    public final void d(HashMap map) throws MethodNotAllowedException {
        if (this.e.f1078a.d) {
            Freshchat.getInstance(this.f2721a).setUserProperties(map);
        }
    }
}
