package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m30 implements FirebaseInstanceIdInternal.NewTokenListener, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18367a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ m30(FirebaseMessaging firebaseMessaging, int i) {
        this.f18367a = i;
        this.b = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        this.b.lambda$new$1(str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f18367a) {
            case 1:
                this.b.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
            default:
                this.b.lambda$handleProxiedNotificationData$5((CloudMessage) obj);
                break;
        }
    }
}
