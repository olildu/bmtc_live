package app.chalo.uistate.dialog;

import app.chalo.providers.stringprovider.StringProvider;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/GenderSelectionDialogUIStateFactory;", "Lorg/koin/core/component/KoinComponent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenderSelectionDialogUIStateFactory implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GenderSelectionDialogUIStateFactory f10001a;
    public static final Object b;

    static {
        final GenderSelectionDialogUIStateFactory genderSelectionDialogUIStateFactory = new GenderSelectionDialogUIStateFactory();
        f10001a = genderSelectionDialogUIStateFactory;
        b = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<StringProvider>() { // from class: app.chalo.uistate.dialog.GenderSelectionDialogUIStateFactory$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10002a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(StringProvider.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x0115  */
    /* JADX WARN: Code duplicated, block: B:32:0x0147  */
    /* JADX WARN: Code duplicated, block: B:33:0x0149  */
    /* JADX WARN: Code duplicated, block: B:35:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0115 -> B:30:0x0116). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.userprofile.Gender r33, java.util.List r34, defpackage.yf1 r35, defpackage.xf1 r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.uistate.dialog.GenderSelectionDialogUIStateFactory.a(app.chalo.userprofile.Gender, java.util.List, yf1, xf1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
