package defpackage;

import app.chalo.home.ui.profile.ProfilePageDisplayItemData;
import app.chalo.home.ui.profile.ProfileScreenViewIntent;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gy0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15776a;
    public final /* synthetic */ ProfilePageDisplayItemData b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ gy0(ProfilePageDisplayItemData profilePageDisplayItemData, Function1 function1, int i, int i2) {
        this.f15776a = i2;
        this.b = profilePageDisplayItemData;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15776a) {
            case 0:
                ProfilePageDisplayItemData profilePageDisplayItemData = this.b;
                ProfilePageFeature profilePageFeature = profilePageDisplayItemData.f;
                if (profilePageFeature != null) {
                    this.c.invoke(new ProfileScreenViewIntent.ProfilePageItemClickedIntent(profilePageFeature, profilePageDisplayItemData.f3593a, Integer.valueOf(this.d)));
                }
                return Unit.f17538a;
            case 1:
                ProfilePageDisplayItemData profilePageDisplayItemData2 = this.b;
                ProfilePageFeature profilePageFeature2 = profilePageDisplayItemData2.f;
                if (profilePageFeature2 != null) {
                    this.c.invoke(new ProfileScreenViewIntent.ProfilePageItemClickedIntent(profilePageFeature2, profilePageDisplayItemData2.f3593a, Integer.valueOf(this.d)));
                }
                return Unit.f17538a;
            default:
                ProfilePageDisplayItemData profilePageDisplayItemData3 = this.b;
                ProfilePageFeature profilePageFeature3 = profilePageDisplayItemData3.f;
                if (profilePageFeature3 == null) {
                    return null;
                }
                this.c.invoke(new ProfileScreenViewIntent.ProfilePageItemClickedIntent(profilePageFeature3, profilePageDisplayItemData3.f3593a, Integer.valueOf(this.d)));
                return Unit.f17538a;
        }
    }
}
