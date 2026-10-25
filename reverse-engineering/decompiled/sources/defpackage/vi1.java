package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.IntOffset;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import app.cash.sqldelight.TransactionWithoutReturn;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.components.TooltipPopupPlacement;
import app.chalo.compose.components.TooltipPopupPosition;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.productsummary.ui.ticket.TicketSummaryComponent;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.vault.Load_money_tableQueries;
import app.chalo.vault.dao.WalletDaoImpl;
import app.chalo.vault.mapper.LoadMoneyEntityMapperKt;
import app.chalo.vault.mapper.WalletTransactionEntityMapperKt;
import app.chalo.wallet.ui.alltransactions.compose.ComposableSingletons$WalletAllTransactionsComposableKt;
import app.chalo.wallet.ui.mainbalance.WalletBalanceDataState;
import app.chalo.wallet.ui.model.WalletTransactionUiWrapper;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.UtilsKt;
import coil3.request.ErrorResult;
import coil3.request.NullRequestDataException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19840a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vi1(int i, Object obj, Object obj2, Object obj3) {
        this.f19840a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iMo5941getSizeYbymL2g;
        int i = this.f19840a;
        int i2 = 0;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, TicketSummaryComponent.F0((TicketSummaryComponent) obj4, (BookingsRequestType.SuperPassRideType) ((BookingsRequestType) obj3)), null, null, (UserDetailsForProducts) obj2, null, null, false, null, null, null, 32405);
            case 1:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, (ChaloUserBookingType) obj4, (ProductReceiptData) ((ChaloUseCaseResult.Success) obj3).f10419a, null, (UserDetailsForProducts) obj2, null, null, false, null, null, null, 32405);
            case 2:
                return TimePickerKt.ClockText$lambda$77$lambda$76((MutableState) obj4, (MutableState) obj3, (MutableState) obj2, (LayoutCoordinates) obj);
            case 3:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) ((Tito_validation_tableQueries) obj4).b.f2022a.encode((TitoValidationStatus) obj3));
                execute.bindString(1, (String) obj2);
                return unit;
            case 4:
                TooltipPopupPlacement placement = (TooltipPopupPlacement) obj4;
                MutableState mutableState = (MutableState) obj2;
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.i(coordinates, "coordinates");
                String message = "coordinatesX : " + Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInWindow(coordinates) >> 32));
                Intrinsics.i(message, "message");
                ((MutableState) obj3).setValue(coordinates);
                Intrinsics.i(placement, "placement");
                Rect rectBoundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(coordinates, false, 1, null);
                float right = rectBoundsInWindow$default.getRight() - ((rectBoundsInWindow$default.getRight() - rectBoundsInWindow$default.getLeft()) / 2);
                int i3 = TooltipPopupComposableKt.WhenMappings.f1850a[placement.ordinal()];
                if (i3 == 1) {
                    iMo5941getSizeYbymL2g = (int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iMo5941getSizeYbymL2g = 0;
                }
                mutableState.setValue(new TooltipPopupPosition(IntOffset.m7396constructorimpl((((long) 0) << 32) | (((long) iMo5941getSizeYbymL2g) & BodyPartID.bodyIdMax)), right));
                return unit;
            case 5:
                return Transformations.switchMap$lambda$3((Function1) obj4, (Ref.ObjectRef) obj3, (MediatorLiveData) obj2, obj);
            case 6:
                Function1 function1 = (Function1) obj4;
                Function1 function2 = (Function1) obj3;
                Function1 function3 = (Function1) obj2;
                AsyncImagePainter.State state = (AsyncImagePainter.State) obj;
                MeasurePolicy measurePolicy = UtilsKt.f11501a;
                if (state instanceof AsyncImagePainter.State.Loading) {
                    if (function1 != null) {
                        function1.invoke(state);
                    }
                } else if (state instanceof AsyncImagePainter.State.Success) {
                    if (function2 != null) {
                        function2.invoke(state);
                    }
                } else if (state instanceof AsyncImagePainter.State.Error) {
                    if (function3 != null) {
                        function3.invoke(state);
                    }
                } else if (!(state instanceof AsyncImagePainter.State.Empty)) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
            case 7:
                Painter painter = (Painter) obj4;
                Painter painter2 = (Painter) obj3;
                Painter painter3 = (Painter) obj2;
                AsyncImagePainter.State state2 = (AsyncImagePainter.State) obj;
                MeasurePolicy measurePolicy2 = UtilsKt.f11501a;
                if (state2 instanceof AsyncImagePainter.State.Loading) {
                    return painter != null ? new AsyncImagePainter.State.Loading(painter) : (AsyncImagePainter.State.Loading) state2;
                }
                if (!(state2 instanceof AsyncImagePainter.State.Error)) {
                    return state2;
                }
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state2;
                ErrorResult errorResult = error.b;
                if (errorResult.c instanceof NullRequestDataException) {
                    return painter2 != null ? new AsyncImagePainter.State.Error(painter2, errorResult) : error;
                }
                return painter3 != null ? new AsyncImagePainter.State.Error(painter3, errorResult) : error;
            case 8:
                Function1 function4 = (Function1) obj3;
                Function1 function5 = (Function1) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                for (WalletTransactionUiWrapper walletTransactionUiWrapper : (List) obj4) {
                    if (walletTransactionUiWrapper.b) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$WalletAllTransactionsComposableKt.f10823a, 3, null);
                    } else if (walletTransactionUiWrapper.c) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1467271464, true, new ab(function4, 14)), 3, null);
                    } else if (walletTransactionUiWrapper.f10887a == null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$WalletAllTransactionsComposableKt.b, 3, null);
                    } else {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1942056136, true, new qb1(13, walletTransactionUiWrapper, function5)), 3, null);
                    }
                }
                return unit;
            case 9:
                WalletAppModel walletAppModel = (WalletAppModel) obj4;
                return WalletBalanceDataState.a((WalletBalanceDataState) obj, false, Integer.valueOf(walletAppModel.getD()), walletAppModel.getC() == CachedWalletStatus.ACTIVE, (List) obj2, null, 0, ((List) obj3).size(), null, false, false, null, false, null, 16224);
            case 10:
                WalletDaoImpl walletDaoImpl = (WalletDaoImpl) obj4;
                TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction, "$this$transaction");
                Load_money_tableQueries load_money_tableQueriesY = walletDaoImpl.y();
                load_money_tableQueriesY.getClass();
                load_money_tableQueriesY.f697a.A0(-793126527, "DELETE FROM load_money_table WHERE walletId = ?", new n10((String) obj3, 20));
                load_money_tableQueriesY.T(-793126527, new qd0(22));
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    walletDaoImpl.y().Y(LoadMoneyEntityMapperKt.a((LoadMoneyEntity) it.next()));
                }
                return unit;
            case 11:
                WalletDaoImpl walletDaoImpl2 = (WalletDaoImpl) obj4;
                walletDaoImpl2.A().b0(WalletTransactionEntityMapperKt.a((WalletTransactionEntity) obj3));
                walletDaoImpl2.y().Y(LoadMoneyEntityMapperKt.a((LoadMoneyEntity) obj2));
                return unit;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, (String) obj4);
                execute2.bindString(1, (String) obj3);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj5 = arrayList.get(i4);
                    i4++;
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    execute2.bindString(i2 + 2, (String) obj5);
                    i2 = i5;
                }
                return unit;
        }
    }
}
